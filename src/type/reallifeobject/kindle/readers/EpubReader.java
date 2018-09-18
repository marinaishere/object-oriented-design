package type.reallifeobject.kindle.readers;


import type.reallifeobject.kindle.books.Book;

public class EpubReader implements IReader {
    private static EpubReader epubReader;

    private EpubReader(){}

    public static EpubReader getSingleton() {
        if (epubReader == null) {
            epubReader = new EpubReader();
        }
        return epubReader;
    }

    @Override
    public void read(Book book) {
        String mobiString = book.getContent();
        String content = mobiString.replace("[epub]", " ");
        System.out.println(content);
    }
}
