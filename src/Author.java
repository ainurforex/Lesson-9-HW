import java.util.Objects;

public class Author {
    private String nameOfAuthor;
    private String familyOfAuthor;

    public Author(String nameOfAuthor, String familyOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
        this.familyOfAuthor = familyOfAuthor;
    }

    public String getNameOfAuthor() {

        return this.nameOfAuthor;
    }

    public String getFamilyOfAuthor() {
        return this.familyOfAuthor;
    }

    public String setNameOfAuthor(String nameOfAuthor) {

        return this.nameOfAuthor = nameOfAuthor;
    }

    public String setFamilyOfAuthor(String familyOfAuthor) {

        return this.familyOfAuthor;
    }

    @Override
    public String toString() {
        return "Автор: " + nameOfAuthor + " " + familyOfAuthor + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return getNameOfAuthor().equals(author.getNameOfAuthor()) && getFamilyOfAuthor().equals(author.getFamilyOfAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfAuthor(), getFamilyOfAuthor());
    }
}
