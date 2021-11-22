package TaskCheckConfig;

import org.junit.*;

public class JunitDemo {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Before
    public void helloWorld() {
        System.out.println("Hello World!");
    }

    @After
    public void byeWorld() {
        System.out.println("Bye World!");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Ignore
    @Test
    public void test2() {
        System.out.println("Test 2");
    }
}
