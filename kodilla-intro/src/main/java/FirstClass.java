public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,1000,2010);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        Notebook oldNotebook = new Notebook(1600,500, 2016);

        firstExtract(notebook);
        firstExtract(heavyNotebook);
        firstExtract(oldNotebook);
    }

    private static void firstExtract(Notebook notebook) {
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
    }
}