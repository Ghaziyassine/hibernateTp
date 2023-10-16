/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import ma.projet.beans.Femme;
import ma.projet.beans.Homme;
import ma.projet.beans.Mariage;
import ma.projet.beans.MariagePK;
import ma.projet.services.FemmeService;
import ma.projet.services.HommeService;
import ma.projet.services.MariageService;


public class Test {

    public static void main(String[] args) {
        FemmeService fs = new FemmeService();
HommeService hs = new HommeService();
MariageService ms = new MariageService();

Homme h1 = new Homme("Ali", "Benzema", "1214141414", "Casablanca", new Date("1987/03/15"));
Homme h2 = new Homme("Khalid", "Lamrani", "1255555555", "Marrakech", new Date("1980/08/10"));
Homme h3 = new Homme("Mehdi", "El Mansouri", "1277777777", "Rabat", new Date("1995/05/25"));
Homme h4 = new Homme("Karim", "Zidane", "1212345678", "Tanger", new Date("1983/14/20"));
Homme h5 = new Homme("Omar", "Tazi", "1243210987", "Agadir", new Date("1990/12/17"));

Femme f1 = new Femme("Sara", "Benmoussa", "1299999999", "Casablanca", new Date("1990/12/03"));
Femme f2 = new Femme("Lina", "Hamid", "1254321234", "Fès", new Date("1985/12/18"));
Femme f3 = new Femme("Amira", "Saadi", "1234543123", "Tanger", new Date("1993/02/10"));
Femme f4 = new Femme("Nadia", "El Khiyati", "1254321987", "Marrakech", new Date("1987/04/25"));
Femme f5 = new Femme("Amina", "Dawoodi", "1243210765", "Rabat", new Date("1994/08/15"));
Femme f6 = new Femme("Noura", "El Gharbi", "1223456789", "Tétouan", new Date("1992/07/22"));
Femme f7 = new Femme("Yasmine", "Soussi", "1254321987", "Agadir", new Date("1998/12/07"));
Femme f8 = new Femme("Leila", "Zahiri", "1278901098", "Fès", new Date("1989/01/15"));
Femme f9 = new Femme("Aicha", "Ouahidi", "1287654321", "Meknès", new Date("1991/03/18"));
Femme f10 = new Femme("Sofia", "Karrouchi", "1212345698", "Oujda", new Date("1996/09/10"));

fs.create(f1);
fs.create(f2);
fs.create(f3);
fs.create(f4);
fs.create(f5);
fs.create(f6);
fs.create(f7);
fs.create(f8);
fs.create(f9);
fs.create(f10);

hs.create(h1);
hs.create(h2);
hs.create(h3);
hs.create(h4);
hs.create(h5);

MariagePK mpk1 = new MariagePK(1, 12, new Date("2022/10/15"));
MariagePK mpk2 = new MariagePK(5, 13, new Date("2020/05/20"));
MariagePK mpk3 = new MariagePK(6, 14, new Date("2021/02/25"));
MariagePK mpk4 = new MariagePK(2, 14, new Date("2022/12/14"));
MariagePK mpk5 = new MariagePK(4, 14, new Date("2022/10/01"));
MariagePK mpk6 = new MariagePK(7, 14, new Date("2017/08/15"));
MariagePK mpk7 = new MariagePK(9, 14, new Date("2016/08/10"));
MariagePK mpk8 = new MariagePK(9, 14, new Date("2016/08/10"));
Mariage m1 = new Mariage(mpk1, null, 2);
Mariage m2 = new Mariage(mpk2, new Date("2022/08/14"), 1);
Mariage m3 = new Mariage(mpk3, null, 3);
Mariage m4 = new Mariage(mpk4, new Date("2018/10/12"), 2);
Mariage m5 = new Mariage(mpk5, new Date("2023/01/01"), 3);
Mariage m6 = new Mariage(mpk6, new Date("2019/12/01"), 3);
Mariage m7 = new Mariage(mpk7, new Date("2020/04/15"), 1);
Mariage m8 = new Mariage(mpk8, new Date("2021/04/15"), 1);

ms.create(m1);
ms.create(m2);
ms.create(m3);
ms.create(m4);
ms.create(m5);
ms.create(m6);
ms.create(m7);
ms.create(m8);
for (Femme ff : fs.getAll()) {
    System.out.println(ff);
}

System.out.println(fs.getFemmeLaPlusAgee().getNom());
hs.getEpousesParHomme(hs.getById(13));
System.out.println(fs.getNombreEnfantsEntreDates(2, new Date("2018/08/12"), new Date("2023/08/12")));
for (Femme f : fs.getFemmesMarieesDeuxFoisOuPlus()) {
    System.out.println(f);
}
hs.HommeQuatreFemme(new Date("2018/08/07"), new Date("2023/12/06"));
for (Mariage m : hs.getMariagesHomme(hs.getById(14))) {
    System.out.println(m);
}

    }
}
