package ru.travelline;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {


@Test

public void MyTest1() throws Exception {

    coastForBooking obj = new coastForBooking();

    int sum = obj.getSum();
    Assert.assertEquals(sum,1520);

    checkDiscount obj1 = new checkDiscount();

    double withDisc = obj1.getSumWithDisc();
    Assert.assertEquals(withDisc, 1524.45);

    int withoutDisc = obj1.getTotal();
    Assert.assertEquals(withoutDisc, 1580);

    checkArray obj2 = new checkArray();
    boolean checkId = obj2.checkId();
    Assert.assertTrue(checkId);
}
}

