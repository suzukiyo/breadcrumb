# パンくずリストデモアプリケーション

このリポジトリは、Spring BootとThymeleafを使用したパンくずリスト機能のデモアプリケーションです。
Java 11 で構築されています。

## 主な機能と特徴

- トップページ (`/`) で、パンくずリストが表示されるデモアプリケーションです。
- パンくずリストは、以下の階層構造を持っています。
  - トップ > ショップ > カテゴリ > サブカテゴリ
- `src/main/java/com/example/breadcrumb/demo/presentation/controller/DemoController.java` が、固定のデータ（ショップ名、カテゴリ名など）を使用してパンくずリストの情報を生成し、画面に渡しています。
- パンくずリストの情報は、`src/main/java/com/example/breadcrumb/demo/domain/breadcrumb/` パッケージ内のクラス群によって管理されています。
  - `Breadcrumb.java`: パンくずの各項目を表すインターフェースです。
  - `BreadcrumbFactory.java`: パンくずリスト全体を構築します。
  - `BreadcrumbOfTop.java`, `BreadcrumbOfShop.java` など: 各階層のパンくず情報を生成するパターンクラスです。
- 表示にはThymeleafテンプレートが使用されています。
  - `src/main/resources/templates/index.html`: メインページです。
  - `src/main/resources/templates/breadcrumbs.html`: パンくずリストの表示を行うThymeleafフラグメントです。
- パンくずリストは `schema.org/BreadcrumbList` を用いた構造化データにも対応しています。

## プロジェクトの主要なパッケージ構成

- `src/main/java/com/example/breadcrumb/demo/domain`:
  - パンくずリストの情報 (`breadcrumb` パッケージ) や、ショップ、カテゴリといったドメインオブジェクト (`shop` パッケージ) が含まれています。
- `src/main/java/com/example/breadcrumb/demo/presentation`:
  - Spring MVCのコントローラー (`controller` パッケージ) が含まれており、画面表示やリクエスト処理を担当します。
- `src/main/resources/templates`:
  - Thymeleafを使用したHTMLテンプレートファイルが格納されています。

## アプリケーションの実行方法

1. リポジトリをクローンまたはダウンロードします。
2. コマンドラインでリポジトリのルートディレクトリに移動します。
3. 以下のコマンドを実行して、Spring Bootアプリケーションを起動します。
   ```bash
   ./gradlew bootRun
   ```
4. ウェブブラウザを開き、 `http://localhost:8080/` にアクセスします。
   パンくずリストが表示されたデモページを確認できます。
