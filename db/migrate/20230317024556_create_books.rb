class CreateBooks < ActiveRecord::Migration[6.1]
  def change
    create_table :books, id: false do |t|
      # id: falseで自動的に生成されるidを主キーにしないようにする
      t.string :title
      t.string :author
      t.bigint :isbn, null: false, primary_key: true
      # isbnは楽天booksでの商品の固有番号のこと。これは被らないのでこいつを主キーに設定する
      t.string :url
      t.string :image_url
      t.timestamps
    end
  end
end
