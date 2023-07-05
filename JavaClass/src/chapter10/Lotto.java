package chapter10;

import java.util.HashSet;

import java.util.HashSet;

public class Lotto {
    public static void main(String[] args) {
        HashSet<Integer> lottoNumbers = new HashSet<>();

        while (lottoNumbers.size() < 6) {
            int randomNumber = (int) (Math.random() * 45) + 1;
            if (!lottoNumbers.contains(randomNumber)) {
                lottoNumbers.add(randomNumber);
            }
        }

        System.out.print("로또 번호는 [");
        boolean isFirst = true;
        for (int lottoNumber : lottoNumbers) {
            if (isFirst) {
                System.out.print(lottoNumber);
                isFirst = false;
            } else {
                System.out.print(", " + lottoNumber);
            }
        }
        System.out.print("]\n");
    }
}

