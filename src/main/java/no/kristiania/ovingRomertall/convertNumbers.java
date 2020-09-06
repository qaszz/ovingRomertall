package no.kristiania.ovingRomertall;

public class convertNumbers {
    public String toRoman(int i) {
        String roman = "";
        while (i >= 10){
            roman += "X";
            i -= 10;
        }
        while (i >= 9){
            roman += "IV";
            i -= 9;
        }
        while (i >= 5){
            roman +="V";
            i -=5;
        }
        while (i >= 4){
            roman += "IV";
            i -= 4;
        }
        while (i >= 1){
            roman += "I";
            i -=1;
        }

        /*if (i == 4){
            roman = "IV";
        }
        else if (i == 9){
            roman = "IX";
        }
        else if (i > 4 && i < 9){
            for (int k = 5; k < i; k++){
                roman +="V";
                i -= 5;
            }
        }
        else{ for (int j = 0; j < i; j++){
                roman += "I";
                i -=1;
            }
        }*/

        return roman;
    }
}
