import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Loan {
    private String isbn;
    private String dni;
    private LocalDateTime date;

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getDate() {
        return date;
    }
    public String getFormatDate(){
        String format = "dd-MM-yyyy HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return formatter.format(this.date);
    }
    public String toString(){
        return "Lending{" + "isbn=" + isbn + ", dni=" + dni + ", date=" + this.getFormatDate() + '}';
    }

}
