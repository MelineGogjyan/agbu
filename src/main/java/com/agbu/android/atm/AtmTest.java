package com.agbu.android.atm;

import com.agbu.android.atm.functional.AtmFunctional;
import com.agbu.android.atm.model.ATM;

public class AtmTest {
    public static void main(String[] args) {
        AtmFunctional functional = new AtmFunctional();

////        System.out.println(atm.getUser());
////        System.out.println(atm.getPassword());
////        System.out.println(atm.isFlag());
////        System.out.println(atm.getMenu());
//
        functional.User();
        functional.Password();
        functional.Menu();


//        String name = functional.createData();
//
//        System.out.println(name);
    }
}
