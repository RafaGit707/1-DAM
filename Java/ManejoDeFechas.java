
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.event.DocumentEvent.ElementChange;


public class ManejoDeFechas {



public static void main(String[] args) {
   
   System.out.println(LocalTime.now());

   System.out.println(LocalDateTime.now());

   DateTimeFormatter miFormatoDeFecha = DateTimeFormatter.ofPattern("dd/MM/yy E w ");
   LocalDateTime fechaActual = LocalDateTime.now();
   LocalTime miHora = LocalTime.of(15, 45);
   LocalDate miFecha = LocalDate.of(2003, 06, 19);
   System.out.println(miFecha);

   LocalDateTime miFechaHora = LocalDateTime.of(miFecha, miHora);
   System.out.println(miFechaHora.format(miFormatoDeFecha));

   miHora = miHora.withHour(23);
   miHora = miHora.withMinute(21);
   System.out.println(miHora);

   miFecha = miFecha.withMonth(5);
   miFecha = miFecha.withYear(2023);
   miFecha = miFecha.withDayOfMonth(10);

   System.out.println(miFecha);

   LocalDate diaSiguiente = miFecha.plusDays(1);
   System.out.println(diaSiguiente);
   LocalDate diaAnterior = miFecha.minusDays(1);
   System.out.println(diaAnterior);

   System.out.println("Actual: " + miFechaHora);
   LocalDateTime nuevaFecha = miFechaHora.plusMinutes(1);
   System.out.println("Nueva: " + nuevaFecha);


   LocalDate nuevaFecha = LocalDate.of();
   Period deHoyAFinDeAno = Period.between(LocalDate.now(nuevaFecha, miFecha));

   int numerosDias = deHoyAFinDeAno.getDays();
   int numerosMeses = deHoyAFinDeAno.getMonths();
   System.out.println(deHoyAFinDeAno.toString());
   System.out.println("Quedan para mi cumple " + numerosMeses + "meses y " + numerosDias + "dias");
}
}