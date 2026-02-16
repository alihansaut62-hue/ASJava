import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

public class passworld {
    String r = "";
    String resy = "";
    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        StringBuilder resy = new StringBuilder();
        StringBuilder lvlPA = new StringBuilder();
        StringBuilder f1 = new StringBuilder();
        StringBuilder f2 = new StringBuilder();
        StringBuilder f3 = new StringBuilder();
        StringBuilder f4 = new StringBuilder();

        //точно не помню что но он помогпет выташить слова с for




        System.out.println("генератор поралей");

        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
        System.out.println("сколько симвлв");
        int b = scan.nextInt();

        System.out.println("Использовать строчные буквы a-z? (y/n): ");
        String s1 = scan.next();
        System.out.println("Использовать заглавные буквы A-Z? (y/n): ");
        String s2 = scan.next();
        System.out.println("Использовать цифры 0-9? (y/n): ");
        String s3 = scan.next();
        System.out.println("Использовать спецсимволы (!@#...)? (y/n): ");
        String s4 = scan.next();
        System.out.println(b + " - " + s1 + s2 + s3 + s4);

        String opl = "";
        int sdf = 0;

        if (s1.equals("y")) {
            opl += "abcdefghijklmnopqrstuvwxyz";
            sdf +=1;
            String d1 = "есть";
            f1.append(d1);
        }
        if (s2.equals("y")) {
            opl += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            sdf +=1;
            String d2 = "есть";
            f2.append(d2);
        }
        if (s3.equals("y")) {
            opl += "0123456789";
            sdf +=1;
            String d3 = "есть";
            f3.append(d3);
        }
        if (s4.equals("y")) {
            opl += "!\"#$%&\\'()*+,-./:;<=>?@[\\\\]^_`{|}~";
            sdf +=1;
            String d4 = "есть";
            f4.append(d4);
        }
        //метод if просто добавляет символы в opl в конце выходит что то на плдобии opl = ["abcdefghijklmnopqrstuvwxyz"
        // "ABCDEFGHIJKLMNOPQRSTUVWXYZ""0123456789""!\"#$%&\\'()*+,-./:;<=>?@[\\\\]^_`{|}~"] ну это зависет от того что выберешь
        for (int i = 0; i < b; i++) {
            char randomChar = opl.charAt(random.nextInt(opl.length()));
            password.append(randomChar);
        }

        if (sdf <=1 || b <= 8){
            String lvlP = "слабый \n";
            System.out.println(lvlP);
            lvlPA.append(lvlP);
        } else if (b > 12 && sdf >= 3) {
            String lvlP = "сильный \n";
            System.out.println(lvlP);
            lvlPA.append(lvlP);
        } else {
            String lvlP = "среднии \n";
            System.out.println(lvlP);
            lvlPA.append(lvlP);
        }
        //это показвает какого уровня пороль его плюс в том что "среднии" находится последним благадаря этому у него нету
        //слабых точек как в обычных когда 11 симвлв и sdf 3 выдает сильный

        String pass = "______________________";
        //opl.length() → сколько символов в строке opl
        //
        //random.nextInt(opl.length()) → случайное число от 0 до length - 1
        //
        //opl.charAt(...) → берём символ по этому индексу
        //
        //Сохраняем его в randomChar
        //
        //Метод append():
        //
        //добавляет символ в конец строки

        System.out.println("\nСгенерированный пароль: " + password);

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите пароль: ");
            String g = scan.next();
            int l = i + 1;
            if (g.equals(password.toString())) {

                String resu = "Доступ разрешён\n";
                System.out.println(resu);
                resy.append(resu);
            } else {
                String resu = "Доступ запрешон\n";
                System.out.println(resu);
                resy.append(resu);}

                {

                    try {Path filePath = Path.of("password.txt");

                        String result = pass.toString();
                        String resul = "попытка номер " + l;
                        String lvl = "уревень пороля " + lvlPA.toString();
                        String g1 = "мальенькие буквы " + f1;
                        String g2 = "большые буквы " + f2;
                        String g3 = "цифры" + f3;
                        String g4 = "симвлы" + f4;

                        Files.write(
                            filePath,
                            (lvl + resul + "\n" + resy + g1 + "\n" + g2 + "\n" + g3 + "\n" + g4 + "\n" + result + "\n" + "\n").getBytes(),
                            StandardOpenOption.CREATE,
                            StandardOpenOption.APPEND
                    );System.out.println("Файл сохранён.");
                    } catch (IOException e)
                    {System.out.println("Ошибка записи файла.");}
                    if (resy.equals("Доступ разрешён")) {
                        break; }

                }

            }


        }


    }

