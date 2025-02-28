package org.example;

public class CheckVowels {
    public static void main(String[] args) {
        char ch='b';
        if (ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch== 'I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
            System.out.println("vowels");
        }
        else {
            System.out.println("Consonants");
        }
    }
}
