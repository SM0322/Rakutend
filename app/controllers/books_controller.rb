class BooksController < ApplicationController
  def index
    @books = Book.all
  end
  
  def show
    @book = Book.find(params[:id])
  end
  
def new
  @books = []
#   @booksの配列を空にする
  @title = params[:title]
#   検索フォームから受け取った文字列を変数に格納
  if @title.present?
    results = RakutenWebService::Books::Book.search({
      title: @title,
      booksGenreId: '001004',
      hits: 20,
    })
    # 受け取ったタイトルで検索をかける
    results.each do |result|
      book = Book.new(read(result))
      @books << book
    end
    # ヒットしたものをそれぞれ新しく作り、@booksの変数に<<で追加する
  end
end

# def create
# #   isbnの結果がなければ初めの1件を取得し1件もなければ作成
#   @book = Book.find_or_initialize_by(isbn: params[:isbn])
# #   データベースに保存されているかチェック
#   unless @book.persisted?
#     results = RakutenWebService::Books::Book.search(isbn: @book.isbn)
#     @book.save
#     redirect_to book_path(@book)
#   end
# end

def create
#   isbnの結果がなければ初めの1件を取得し1件もなければ作成
    @book = Book.find_or_initialize_by(isbn: params[:isbn])

#   データベースに保存されているかチェック
    unless @book.persisted?
      results = RakutenWebService::Books::Book.search(isbn: @book.isbn)
      @book = Book.new(read(results.first))
      @book.save
      redirect_to book_path(@book)
    end
end

  private
  
  def read(result)
    title = result['title']
    url = result['url']
    isbn = result['isbn']
    image_url = result['mediumImageUrl'].gsub('?_ex=120×120', '')
    {
      title: title,
      url: url,
      isbn: isbn,
      image_url: image_url,
    }
  end
end
