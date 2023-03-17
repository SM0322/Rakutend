class BooksController < ApplicationController
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
