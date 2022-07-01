public class Author {
    private String nameOfAuthor;
    private String familyOfAuthor;

    public Author(String nameOfAuthor,String familyOfAuthor) {
        this.nameOfAuthor=nameOfAuthor;
        this.familyOfAuthor=familyOfAuthor;
    }

    public String getNameOfAuthor() {
        return this.nameOfAuthor;
    }

    public String getFamilyOfAuthor() {
        return this.familyOfAuthor;
    }

}
