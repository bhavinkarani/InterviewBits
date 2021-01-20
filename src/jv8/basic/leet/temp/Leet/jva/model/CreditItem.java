package nl.ing.api.cash.order.temp.Leet.jva.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class CreditItem {
    String name;
    String address;
    String postcode;
    String phone;
    Double credit_limit;
    Birthday birthday;

    /*public String toString(){
        return getName() + getAddress();
    }*/
}
