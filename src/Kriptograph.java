/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VIP 5
 */
import javax.swing.*;
public class Kriptograph {
    public static void main(String[] args) {
    Konversi Chiper=new Konversi ();
    String Huruf,hu1,hu2,hu3,hu4;
    Huruf=JOptionPane.showInputDialog("Masukkan kata : ","Masukkan 4 karakter - (Contoh : ABCD)");
    int hitung=Huruf.length();
    if(hitung==1){
    hu1=Huruf.substring(0,1);
    switch(hu1){
        case "A":Chiper.abx=1;Chiper.Hasil1();break;
        case "B":Chiper.abx=2;Chiper.Hasil1();break;
        case "C":Chiper.abx=3;Chiper.Hasil1();break;
        case "D":Chiper.abx=4;Chiper.Hasil1();break;
        case "E":Chiper.abx=5;Chiper.Hasil1();break;
        case "F":Chiper.abx=6;Chiper.Hasil1();break;
        case "G":Chiper.abx=7;Chiper.Hasil1();break;
        case "H":Chiper.abx=8;Chiper.Hasil1();break;
        case "I":Chiper.abx=9;Chiper.Hasil1();break;
        case "J":Chiper.abx=10;Chiper.Hasil1();break;
        case "K":Chiper.abx=11;Chiper.Hasil1();break;
        case "L":Chiper.abx=12;Chiper.Hasil1();break;
        case "M":Chiper.abx=13;Chiper.Hasil1();break;
        case "N":Chiper.abx=14;Chiper.Hasil1();break;
        case "O":Chiper.abx=15;Chiper.Hasil1();break;
        case "P":Chiper.abx=16;Chiper.Hasil1();break;
        case "Q":Chiper.abx=17;Chiper.Hasil1();break;
        case "R":Chiper.abx=18;Chiper.Hasil1();break;
        case "S":Chiper.abx=19;Chiper.Hasil1();break;
        case "T":Chiper.abx=20;Chiper.Hasil1();break;
        case "U":Chiper.abx=21;Chiper.Hasil1();break;
        case "V":Chiper.abx=22;Chiper.Hasil1();break;
        case "W":Chiper.abx=23;Chiper.Hasil1();break;
        case "X":Chiper.abx=24;Chiper.Hasil1();break;
        case "Y":Chiper.abx=25;Chiper.Hasil1();break;
        case "Z":Chiper.abx=26;Chiper.Hasil1();break;
    }
}
//===============================================================================================================
else if(hitung==2){
    hu1=Huruf.substring(0,1);
    hu2=Huruf.substring(1,2);
    switch(hu1){
        case "A":Chiper.abx=1;Chiper.Hasil1();break;
        case "B":Chiper.abx=2;Chiper.Hasil1();break;
        case "C":Chiper.abx=3;Chiper.Hasil1();break;
        case "D":Chiper.abx=4;Chiper.Hasil1();break;
        case "E":Chiper.abx=5;Chiper.Hasil1();break;
        case "F":Chiper.abx=6;Chiper.Hasil1();break;
        case "G":Chiper.abx=7;Chiper.Hasil1();break;
        case "H":Chiper.abx=8;Chiper.Hasil1();break;
        case "I":Chiper.abx=9;Chiper.Hasil1();break;
        case "J":Chiper.abx=10;Chiper.Hasil1();break;
        case "K":Chiper.abx=11;Chiper.Hasil1();break;
        case "L":Chiper.abx=12;Chiper.Hasil1();break;
        case "M":Chiper.abx=13;Chiper.Hasil1();break;
        case "N":Chiper.abx=14;Chiper.Hasil1();break;
        case "O":Chiper.abx=15;Chiper.Hasil1();break;
        case "P":Chiper.abx=16;Chiper.Hasil1();break;
        case "Q":Chiper.abx=17;Chiper.Hasil1();break;
        case "R":Chiper.abx=18;Chiper.Hasil1();break;
        case "S":Chiper.abx=19;Chiper.Hasil1();break;
        case "T":Chiper.abx=20;Chiper.Hasil1();break;
        case "U":Chiper.abx=21;Chiper.Hasil1();break;
        case "V":Chiper.abx=22;Chiper.Hasil1();break;
        case "W":Chiper.abx=23;Chiper.Hasil1();break;
        case "X":Chiper.abx=24;Chiper.Hasil1();break;
        case "Y":Chiper.abx=25;Chiper.Hasil1();break;
        case "Z":Chiper.abx=26;Chiper.Hasil1();break;
        case "0":Chiper.abx=27;Chiper.Hasil1();break;
        case "1":Chiper.abx=28;Chiper.Hasil1();break;
        case "2":Chiper.abx=29;Chiper.Hasil1();break;
        case "3":Chiper.abx=30;Chiper.Hasil1();break;
        case "4":Chiper.abx=31;Chiper.Hasil1();break;
        case "5":Chiper.abx=32;Chiper.Hasil1();break;
        case "6":Chiper.abx=33;Chiper.Hasil1();break;
        case "7":Chiper.abx=34;Chiper.Hasil1();break;
        case "8":Chiper.abx=35;Chiper.Hasil1();break;
        case "9":Chiper.abx=36;Chiper.Hasil1();break;
    }
switch(hu2){
        case "A":Chiper.abx=1;Chiper.Hasil2();break;
        case "B":Chiper.abx=2;Chiper.Hasil2();break;
        case "C":Chiper.abx=3;Chiper.Hasil2();break;
        case "D":Chiper.abx=4;Chiper.Hasil2();break;
        case "E":Chiper.abx=5;Chiper.Hasil2();break;
        case "F":Chiper.abx=6;Chiper.Hasil2();break;
        case "G":Chiper.abx=7;Chiper.Hasil2();break;
        case "H":Chiper.abx=8;Chiper.Hasil2();break;
        case "I":Chiper.abx=9;Chiper.Hasil2();break;
        case "J":Chiper.abx=10;Chiper.Hasil2();break;
        case "K":Chiper.abx=11;Chiper.Hasil2();break;
        case "L":Chiper.abx=12;Chiper.Hasil2();break;
        case "M":Chiper.abx=13;Chiper.Hasil2();break;
        case "N":Chiper.abx=14;Chiper.Hasil2();break;
        case "O":Chiper.abx=15;Chiper.Hasil2();break;
        case "P":Chiper.abx=16;Chiper.Hasil2();break;
        case "Q":Chiper.abx=17;Chiper.Hasil2();break;
        case "R":Chiper.abx=18;Chiper.Hasil2();break;
        case "S":Chiper.abx=19;Chiper.Hasil2();break;
        case "T":Chiper.abx=20;Chiper.Hasil2();break;
        case "U":Chiper.abx=21;Chiper.Hasil2();break;
        case "V":Chiper.abx=22;Chiper.Hasil2();break;
        case "W":Chiper.abx=23;Chiper.Hasil2();break;
        case "X":Chiper.abx=24;Chiper.Hasil2();break;
        case "Y":Chiper.abx=25;Chiper.Hasil2();break;
        case "Z":Chiper.abx=26;Chiper.Hasil2();break;
    }
    
}
//=====================================================================================================================
else if(hitung==3){
    hu1=Huruf.substring(0,1);
    hu2=Huruf.substring(1,2);
    hu3=Huruf.substring(2,3);
    switch(hu1){
        case "A":Chiper.abx=1;Chiper.Hasil1();break;
        case "B":Chiper.abx=2;Chiper.Hasil1();break;
        case "C":Chiper.abx=3;Chiper.Hasil1();break;
        case "D":Chiper.abx=4;Chiper.Hasil1();break;
        case "E":Chiper.abx=5;Chiper.Hasil1();break;
        case "F":Chiper.abx=6;Chiper.Hasil1();break;
        case "G":Chiper.abx=7;Chiper.Hasil1();break;
        case "H":Chiper.abx=8;Chiper.Hasil1();break;
        case "I":Chiper.abx=9;Chiper.Hasil1();break;
        case "J":Chiper.abx=10;Chiper.Hasil1();break;
        case "K":Chiper.abx=11;Chiper.Hasil1();break;
        case "L":Chiper.abx=12;Chiper.Hasil1();break;
        case "M":Chiper.abx=13;Chiper.Hasil1();break;
        case "N":Chiper.abx=14;Chiper.Hasil1();break;
        case "O":Chiper.abx=15;Chiper.Hasil1();break;
        case "P":Chiper.abx=16;Chiper.Hasil1();break;
        case "Q":Chiper.abx=17;Chiper.Hasil1();break;
        case "R":Chiper.abx=18;Chiper.Hasil1();break;
        case "S":Chiper.abx=19;Chiper.Hasil1();break;
        case "T":Chiper.abx=20;Chiper.Hasil1();break;
        case "U":Chiper.abx=21;Chiper.Hasil1();break;
        case "V":Chiper.abx=22;Chiper.Hasil1();break;
        case "W":Chiper.abx=23;Chiper.Hasil1();break;
        case "X":Chiper.abx=24;Chiper.Hasil1();break;
        case "Y":Chiper.abx=25;Chiper.Hasil1();break;
        case "Z":Chiper.abx=26;Chiper.Hasil1();break;
    }
switch(hu2){
        case "A":Chiper.abx=1;Chiper.Hasil2();break;
        case "B":Chiper.abx=2;Chiper.Hasil2();break;
        case "C":Chiper.abx=3;Chiper.Hasil2();break;
        case "D":Chiper.abx=4;Chiper.Hasil2();break;
        case "E":Chiper.abx=5;Chiper.Hasil2();break;
        case "F":Chiper.abx=6;Chiper.Hasil2();break;
        case "G":Chiper.abx=7;Chiper.Hasil2();break;
        case "H":Chiper.abx=8;Chiper.Hasil2();break;
        case "I":Chiper.abx=9;Chiper.Hasil2();break;
        case "J":Chiper.abx=10;Chiper.Hasil2();break;
        case "K":Chiper.abx=11;Chiper.Hasil2();break;
        case "L":Chiper.abx=12;Chiper.Hasil2();break;
        case "M":Chiper.abx=13;Chiper.Hasil2();break;
        case "N":Chiper.abx=14;Chiper.Hasil2();break;
        case "O":Chiper.abx=15;Chiper.Hasil2();break;
        case "P":Chiper.abx=16;Chiper.Hasil2();break;
        case "Q":Chiper.abx=17;Chiper.Hasil2();break;
        case "R":Chiper.abx=18;Chiper.Hasil2();break;
        case "S":Chiper.abx=19;Chiper.Hasil2();break;
        case "T":Chiper.abx=20;Chiper.Hasil2();break;
        case "U":Chiper.abx=21;Chiper.Hasil2();break;
        case "V":Chiper.abx=22;Chiper.Hasil2();break;
        case "W":Chiper.abx=23;Chiper.Hasil2();break;
        case "X":Chiper.abx=24;Chiper.Hasil2();break;
        case "Y":Chiper.abx=25;Chiper.Hasil2();break;
        case "Z":Chiper.abx=26;Chiper.Hasil2();break;
    }
switch(hu3){
        case "A":Chiper.abx=1;Chiper.Hasil3();break;
        case "B":Chiper.abx=2;Chiper.Hasil3();break;
        case "C":Chiper.abx=3;Chiper.Hasil3();break;
        case "D":Chiper.abx=4;Chiper.Hasil3();break;
        case "E":Chiper.abx=5;Chiper.Hasil3();break;
        case "F":Chiper.abx=6;Chiper.Hasil3();break;
        case "G":Chiper.abx=7;Chiper.Hasil3();break;
        case "H":Chiper.abx=8;Chiper.Hasil3();break;
        case "I":Chiper.abx=9;Chiper.Hasil3();break;
        case "J":Chiper.abx=10;Chiper.Hasil3();break;
        case "K":Chiper.abx=11;Chiper.Hasil3();break;
        case "L":Chiper.abx=12;Chiper.Hasil3();break;
        case "M":Chiper.abx=13;Chiper.Hasil3();break;
        case "N":Chiper.abx=14;Chiper.Hasil3();break;
        case "O":Chiper.abx=15;Chiper.Hasil3();break;
        case "P":Chiper.abx=16;Chiper.Hasil3();break;
        case "Q":Chiper.abx=17;Chiper.Hasil3();break;
        case "R":Chiper.abx=18;Chiper.Hasil3();break;
        case "S":Chiper.abx=19;Chiper.Hasil3();break;
        case "T":Chiper.abx=20;Chiper.Hasil3();break;
        case "U":Chiper.abx=21;Chiper.Hasil3();break;
        case "V":Chiper.abx=22;Chiper.Hasil3();break;
        case "W":Chiper.abx=23;Chiper.Hasil3();break;
        case "X":Chiper.abx=24;Chiper.Hasil3();break;
        case "Y":Chiper.abx=25;Chiper.Hasil3();break;
        case "Z":Chiper.abx=26;Chiper.Hasil3();break;
    }
    
}
//=================================================================================================
else if(hitung==4){
    hu1=Huruf.substring(0,1);
    hu2=Huruf.substring(1,2);
    hu3=Huruf.substring(2,3);
    hu4=Huruf.substring(3,4);
    switch(hu1){
        case "A":Chiper.abx=1;Chiper.Hasil1();break;
        case "B":Chiper.abx=2;Chiper.Hasil1();break;
        case "C":Chiper.abx=3;Chiper.Hasil1();break;
        case "D":Chiper.abx=4;Chiper.Hasil1();break;
        case "E":Chiper.abx=5;Chiper.Hasil1();break;
        case "F":Chiper.abx=6;Chiper.Hasil1();break;
        case "G":Chiper.abx=7;Chiper.Hasil1();break;
        case "H":Chiper.abx=8;Chiper.Hasil1();break;
        case "I":Chiper.abx=9;Chiper.Hasil1();break;
        case "J":Chiper.abx=10;Chiper.Hasil1();break;
        case "K":Chiper.abx=11;Chiper.Hasil1();break;
        case "L":Chiper.abx=12;Chiper.Hasil1();break;
        case "M":Chiper.abx=13;Chiper.Hasil1();break;
        case "N":Chiper.abx=14;Chiper.Hasil1();break;
        case "O":Chiper.abx=15;Chiper.Hasil1();break;
        case "P":Chiper.abx=16;Chiper.Hasil1();break;
        case "Q":Chiper.abx=17;Chiper.Hasil1();break;
        case "R":Chiper.abx=18;Chiper.Hasil1();break;
        case "S":Chiper.abx=19;Chiper.Hasil1();break;
        case "T":Chiper.abx=20;Chiper.Hasil1();break;
        case "U":Chiper.abx=21;Chiper.Hasil1();break;
        case "V":Chiper.abx=22;Chiper.Hasil1();break;
        case "W":Chiper.abx=23;Chiper.Hasil1();break;
        case "X":Chiper.abx=24;Chiper.Hasil1();break;
        case "Y":Chiper.abx=25;Chiper.Hasil1();break;
        case "Z":Chiper.abx=26;Chiper.Hasil1();break;
    }
switch(hu2){
        case "A":Chiper.abx=1;Chiper.Hasil2();break;
        case "B":Chiper.abx=2;Chiper.Hasil2();break;
        case "C":Chiper.abx=3;Chiper.Hasil2();break;
        case "D":Chiper.abx=4;Chiper.Hasil2();break;
        case "E":Chiper.abx=5;Chiper.Hasil2();break;
        case "F":Chiper.abx=6;Chiper.Hasil2();break;
        case "G":Chiper.abx=7;Chiper.Hasil2();break;
        case "H":Chiper.abx=8;Chiper.Hasil2();break;
        case "I":Chiper.abx=9;Chiper.Hasil2();break;
        case "J":Chiper.abx=10;Chiper.Hasil2();break;
        case "K":Chiper.abx=11;Chiper.Hasil2();break;
        case "L":Chiper.abx=12;Chiper.Hasil2();break;
        case "M":Chiper.abx=13;Chiper.Hasil2();break;
        case "N":Chiper.abx=14;Chiper.Hasil2();break;
        case "O":Chiper.abx=15;Chiper.Hasil2();break;
        case "P":Chiper.abx=16;Chiper.Hasil2();break;
        case "Q":Chiper.abx=17;Chiper.Hasil2();break;
        case "R":Chiper.abx=18;Chiper.Hasil2();break;
        case "S":Chiper.abx=19;Chiper.Hasil2();break;
        case "T":Chiper.abx=20;Chiper.Hasil2();break;
        case "U":Chiper.abx=21;Chiper.Hasil2();break;
        case "V":Chiper.abx=22;Chiper.Hasil2();break;
        case "W":Chiper.abx=23;Chiper.Hasil2();break;
        case "X":Chiper.abx=24;Chiper.Hasil2();break;
        case "Y":Chiper.abx=25;Chiper.Hasil2();break;
        case "Z":Chiper.abx=26;Chiper.Hasil2();break;
    }
switch(hu3){
        case "A":Chiper.abx=1;Chiper.Hasil3();break;
        case "B":Chiper.abx=2;Chiper.Hasil3();break;
        case "C":Chiper.abx=3;Chiper.Hasil3();break;
        case "D":Chiper.abx=4;Chiper.Hasil3();break;
        case "E":Chiper.abx=5;Chiper.Hasil3();break;
        case "F":Chiper.abx=6;Chiper.Hasil3();break;
        case "G":Chiper.abx=7;Chiper.Hasil3();break;
        case "H":Chiper.abx=8;Chiper.Hasil3();break;
        case "I":Chiper.abx=9;Chiper.Hasil3();break;
        case "J":Chiper.abx=10;Chiper.Hasil3();break;
        case "K":Chiper.abx=11;Chiper.Hasil3();break;
        case "L":Chiper.abx=12;Chiper.Hasil3();break;
        case "M":Chiper.abx=13;Chiper.Hasil3();break;
        case "N":Chiper.abx=14;Chiper.Hasil3();break;
        case "O":Chiper.abx=15;Chiper.Hasil3();break;
        case "P":Chiper.abx=16;Chiper.Hasil3();break;
        case "Q":Chiper.abx=17;Chiper.Hasil3();break;
        case "R":Chiper.abx=18;Chiper.Hasil3();break;
        case "S":Chiper.abx=19;Chiper.Hasil3();break;
        case "T":Chiper.abx=20;Chiper.Hasil3();break;
        case "U":Chiper.abx=21;Chiper.Hasil3();break;
        case "V":Chiper.abx=22;Chiper.Hasil3();break;
        case "W":Chiper.abx=23;Chiper.Hasil3();break;
        case "X":Chiper.abx=24;Chiper.Hasil3();break;
        case "Y":Chiper.abx=25;Chiper.Hasil3();break;
        case "Z":Chiper.abx=26;Chiper.Hasil3();break;
    }
switch(hu4){
        case "A":Chiper.abx=1;Chiper.Hasil4();break;
        case "B":Chiper.abx=2;Chiper.Hasil4();break;
        case "C":Chiper.abx=3;Chiper.Hasil4();break;
        case "D":Chiper.abx=4;Chiper.Hasil4();break;
        case "E":Chiper.abx=5;Chiper.Hasil4();break;
        case "F":Chiper.abx=6;Chiper.Hasil4();break;
        case "G":Chiper.abx=7;Chiper.Hasil4();break;
        case "H":Chiper.abx=8;Chiper.Hasil4();break;
        case "I":Chiper.abx=9;Chiper.Hasil4();break;
        case "J":Chiper.abx=10;Chiper.Hasil4();break;
        case "K":Chiper.abx=11;Chiper.Hasil4();break;
        case "L":Chiper.abx=12;Chiper.Hasil4();break;
        case "M":Chiper.abx=13;Chiper.Hasil4();break;
        case "N":Chiper.abx=14;Chiper.Hasil4();break;
        case "O":Chiper.abx=15;Chiper.Hasil4();break;
        case "P":Chiper.abx=16;Chiper.Hasil4();break;
        case "Q":Chiper.abx=17;Chiper.Hasil4();break;
        case "R":Chiper.abx=18;Chiper.Hasil4();break;
        case "S":Chiper.abx=19;Chiper.Hasil4();break;
        case "T":Chiper.abx=20;Chiper.Hasil4();break;
        case "U":Chiper.abx=21;Chiper.Hasil4();break;
        case "V":Chiper.abx=22;Chiper.Hasil4();break;
        case "W":Chiper.abx=23;Chiper.Hasil4();break;
        case "X":Chiper.abx=24;Chiper.Hasil4();break;
        case "Y":Chiper.abx=25;Chiper.Hasil4();break;
        case "Z":Chiper.abx=26;Chiper.Hasil4();break;
    }
}
    if (Huruf=="inputan salah"){
        JOptionPane.showMessageDialog(null," invalid input"," ",JOptionPane.ERROR_MESSAGE);
        }
    else if(hitung>=9){
        JOptionPane.showMessageDialog(null," Input melebihi batas maksimum"," ",JOptionPane.ERROR_MESSAGE);
    }
    else if(hitung==1){
        JOptionPane.showMessageDialog(null,"Kata Masukan  : "+Huruf+"\nHasil Chiper    :  "+Chiper.ab1bin,"Hasil",JOptionPane.INFORMATION_MESSAGE);
        }
    else if(hitung==2){
        JOptionPane.showMessageDialog(null,"Kata Masukan  : "+Huruf+"\nHasil Chiper    :  "+Chiper.ab1bin+" "+Chiper.ab2bin,"Hasil",JOptionPane.INFORMATION_MESSAGE);
        }
    else if(hitung==3){
        JOptionPane.showMessageDialog(null,"Kata Masukan  : "+Huruf+"\nHasil Chiper    :  "+Chiper.ab1bin+" "+Chiper.ab2bin+" "+Chiper.ab3bin,"Hasil",JOptionPane.INFORMATION_MESSAGE);
        }
    else if(hitung==4){
        JOptionPane.showMessageDialog(null,"Kata Masukan  : "+Huruf+"\nHasil Chiper    :  "+Chiper.ab1bin+" "+Chiper.ab2bin+" "+Chiper.ab3bin,"Hasil",JOptionPane.INFORMATION_MESSAGE);
        }
}
}
