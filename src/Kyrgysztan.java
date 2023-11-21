public enum Kyrgysztan {
    DjalalAbad("Мен джалал абаата жашайм"),
    Batken("Batkende alma jegem"),
    Ysykkul("Yssyk kuldo suuga tushkom"),
    Naryn("Naaraynda semeteydi korgony bargam"),
    Osh("Oshko ayyldap bargam"),
    Tallas("Tallaska muzey gorgony bargam"),
    Chuy("Chyudu korgon emesmin");
    String name ;

    @Override
    public String toString() {
        return "Kyrgysztan{" +
                "name='" + name + '\'' +
                '}';
    }

    Kyrgysztan(String name) {
        this.name = name;

    }
}
