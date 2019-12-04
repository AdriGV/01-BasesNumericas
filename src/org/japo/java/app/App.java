/* 
 * Copyright 2019 AdrianGV adrian.gimeno.alum@iescamp.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import org.japo.java.libraries.UtilesBasesNum;

/**
 *
 * @author CicloM
 */
public final class App {

    public static final String A1 = "110";
    public static final String A2 = "1100";
    public static final String A3 = "11001";
    public static final String A4 = "110011";
    public static final String A5 = "1";
    public static final String A6 = "13";
    public static final String A7 = "135";
    public static final String A8 = "1357";
    public static final String A9 = "5";
    public static final String A10 = "10";
    public static final String A11 = "20";
    public static final String A12 = "100";
    public static final String A13 = "1000";
    public static final String A14 = "2";
    public static final String A15 = "C";
    public static final String A16 = "CA";
    public static final String A17 = "B0B0";
    public static final String A18 = "DAD0";
    public static final String A19 = "FE0";
    public static final String A21 = "FF";
    public static final String A22 = "2048";
    public static final String A23 = "512";
    public static final String A24 = "64";
    public static final String A25 = "8";
    public static final String A26 = "246";
    public static final String A27 = "52";
    public static final String A28 = "7";
    public static final String A29 = "10101010101";
    public static final String A30 = "111000";

    public final void launchApp() {
        //Valores tabla
        System.out.println("Tabla Bases Númericas");
        System.out.println("=====================");

        System.out.printf("0b%s 0%s %s 0x%S %n", A1, UtilesBasesNum.binToOct(A1),
                UtilesBasesNum.binToDec(A1), UtilesBasesNum.binToHex(A1)
        );
        System.out.printf("0b%s 0%s %s 0x%S %n", A2, UtilesBasesNum.binToOct(A2),
                UtilesBasesNum.binToDec(A2), UtilesBasesNum.binToHex(A2)
        );

        System.out.printf("0b%s 0%s %s 0x%S %n", A3, UtilesBasesNum.binToOct(A3),
                UtilesBasesNum.binToDec(A3), UtilesBasesNum.binToHex(A3)
        );

        System.out.printf("0b%s 0%s %s 0x%S %n", A4, UtilesBasesNum.binToOct(A4),
                UtilesBasesNum.binToDec(A4), UtilesBasesNum.binToHex(A4)
        );

        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.octToBin(A5), A5,
                UtilesBasesNum.octToDec(A5), UtilesBasesNum.octToHex(A5)
        );

        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.octToBin(A6), A6,
                UtilesBasesNum.octToDec(A6), UtilesBasesNum.octToHex(A6)
        );

        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.octToBin(A7), A7,
                UtilesBasesNum.octToDec(A7), UtilesBasesNum.octToHex(A7)
        );

        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.octToBin(A8), A8,
                UtilesBasesNum.octToDec(A8), UtilesBasesNum.octToHex(A8)
        );

        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.decToBin(A9),
                UtilesBasesNum.decToOct(A9), A9, UtilesBasesNum.decToHex(A9)
        );

        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.decToBin(A10),
                UtilesBasesNum.decToOct(A10), A10, UtilesBasesNum.decToHex(A10)
        );

        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.decToBin(A11),
                UtilesBasesNum.decToOct(A11), A11, UtilesBasesNum.decToHex(A11)
        );

        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.decToBin(A12),
                UtilesBasesNum.decToOct(A12), A12, UtilesBasesNum.decToHex(A12)
        );

        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.decToBin(A13),
                UtilesBasesNum.decToOct(A13), A13, UtilesBasesNum.decToHex(A13)
        );

        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.hexToBin(A14),
                UtilesBasesNum.hexToOct(A14), UtilesBasesNum.hexToDec(A14), A14
        );
        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.hexToBin(A15),
                UtilesBasesNum.hexToOct(A15), UtilesBasesNum.hexToDec(A15), A15
        );
        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.hexToBin(A16),
                UtilesBasesNum.hexToOct(A16), UtilesBasesNum.hexToDec(A16), A16
        );
        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.hexToBin(A17),
                UtilesBasesNum.hexToOct(A17), UtilesBasesNum.hexToDec(A17), A17
        );
        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.hexToBin(A18),
                UtilesBasesNum.hexToOct(A18), UtilesBasesNum.hexToDec(A18), A18
        );
        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.hexToBin(A19),
                UtilesBasesNum.hexToOct(A19), UtilesBasesNum.hexToDec(A19), A19
        );
        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.hexToBin(A21),
                UtilesBasesNum.hexToOct(A21), UtilesBasesNum.hexToDec(A21), A21
        );
        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.decToBin(A22),
                UtilesBasesNum.decToOct(A22), A22, UtilesBasesNum.decToHex(A22)
        );
        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.decToBin(A23),
                UtilesBasesNum.decToOct(A23), A23, UtilesBasesNum.decToHex(A23)
        );
        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.decToBin(A24),
                UtilesBasesNum.decToOct(A24), A24, UtilesBasesNum.decToHex(A24)
        );
        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.decToBin(A25),
                UtilesBasesNum.decToOct(A25), A25, UtilesBasesNum.decToHex(A25)
        );
        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.octToBin(A26), A26,
                UtilesBasesNum.octToDec(A26), UtilesBasesNum.octToHex(A26)
        );
        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.octToBin(A27), A27,
                UtilesBasesNum.octToDec(A27), UtilesBasesNum.octToHex(A27)
        );
        System.out.printf("0b%s 0%s %s 0x%S %n", UtilesBasesNum.octToBin(A28), A28,
                UtilesBasesNum.octToDec(A28), UtilesBasesNum.octToHex(A28)
        );
        System.out.printf("0b%s 0%s %s 0x%S %n", A29, UtilesBasesNum.binToOct(A29),
                UtilesBasesNum.binToDec(A29), UtilesBasesNum.binToHex(A29)
        );
        System.out.printf("0b%s 0%s %s 0x%S %n", A30, UtilesBasesNum.binToOct(A30),
                UtilesBasesNum.binToDec(A30), UtilesBasesNum.binToHex(A30)
        );

//        System.out.printf("%s %s %s %S %n", UtilesBasesNum.decToBin(A5),
//                UtilesBasesNum.decToOct(A5), A5,UtilesBasesNum.decToHex(A5)
//        );
    }
}
