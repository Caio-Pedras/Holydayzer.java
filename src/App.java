import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Holiday> holidayList = new ArrayList<>();

        holidayList.add(new Holiday("Confraternização mundial", "01/01/2023"));

        holidayList.add(new Holiday("Carnaval", "21/02/2023"));
        holidayList.add(new Holiday("Páscoa", "17/04/2023"));
        holidayList.add(new Holiday("Tiradentes", "21/04/2023"));
        holidayList.add(new Holiday("Dia do Trabalho", "01/05/2023"));
        holidayList.add(new Holiday("Corpus Christi", "08/06/2023"));
        holidayList.add(new Holiday("Independência do Brasil", "07/09/2023"));
        holidayList.add(new Holiday("Nossa Senhora Aparecida", "12/10/2023"));
        holidayList.add(new Holiday("Finados", "02/11/2023"));
        holidayList.add(new Holiday("Proclamação da República", "15/11/2023"));
        holidayList.add(new Holiday("Natal", "25/12/2023"));

        System.out.print("1 - Buscar por feriado\n2 - Imprimir todos os feriados\n");
        int input = scanner.nextInt();

        while (input == 1 || input == 2) {
            if (input == 1) {
                Scanner dateScanner = new Scanner(System.in);
                System.out.print("Digite a data no formato dd/mm/yyyy");
                String dateInput = dateScanner.nextLine();

                int index = -1;
                for (int i = 0; i < holidayList.size(); i++) {
                    Holiday holiday = holidayList.get(i);
                    if (holiday.getDate().equals(dateInput)) {
                        index = i;
                    }
                }
                if (index == -1) {
                    System.out.print("Não existe feriado com essa data\n");
                } else {
                    System.out.println(holidayList.get(index).getHoliday());
                }

            }
            if (input == 2) {
                System.out.println();
                holidayList.forEach((holiday) -> System.out.println(holiday.getHoliday()));
            }
            System.out.print("1 - Buscar por feriado\n2 - Imprimir todos os feriados\n");
            input = scanner.nextInt();
        }

    }
}
