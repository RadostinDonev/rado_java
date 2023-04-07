import java.util.Date;
import java.util.Random;

public class DiagnosticOrder {
    private Car car;
    private Date registrationDate;
    private String diagnostician;
    private Date diagnosticDate;
    private Service service;
    private Date serviceDate;
    private String worker;
    private Date closingDate;

    public DiagnosticOrder(Car car, Date registrationDate) {
        this.car = car;
        this.registrationDate = registrationDate;
    }

}
