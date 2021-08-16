public class HtmlMain {

    public static void main(String[] args) throws Exception {

        SaveHtml saveHtml = new SaveHtml("index.html","http://osteriafino.pl/");
        saveHtml.saveHtmlToFile();

    }

}
