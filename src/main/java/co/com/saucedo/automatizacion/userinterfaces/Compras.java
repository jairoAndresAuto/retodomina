package co.com.saucedo.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Compras {

    public static final Target BTN_AGREGAR = Target.the("User Name Login")
            .located(By.className("btn_inventory"));
    public static final Target BTN_CARRITO = Target.the("User Name Login")
            .located(By.className("shopping_cart_link"));
    public static final Target BTN_REMOVER = Target.the("User Name Login")
            .located(By.className("cart_button"));
    public static final Target BTN_CHECKOUT = Target.the("User Name Login")
            .located(By.id("checkout"));
    public static final Target TXT_PRIMER_NOMBRE = Target.the("User Name Login")
            .located(By.id("first-name"));
    public static final Target TXT_PRIMER_APELLIDO = Target.the("User Name Login")
            .located(By.id("last-name"));
    public static final Target TXT_CODIGO_POSTAL = Target.the("User Name Login")
            .located(By.id("postal-code"));
    public static final Target BTN_CONTINUAR = Target.the("User Name Login")
            .located(By.id("continue"));
    public static final Target BTN_FINALIZAR = Target.the("User Name Login")
            .located(By.id("finish"));
    public static final Target LBL_MENSAJE = Target.the("User Name Login")
            .located(By.xpath("//h2[contains(.,'Thank you for your order!')]"));
    public static final Target BTN_MENU = Target.the("User Name Login")
            .located(By.id("react-burger-menu-btn"));
    public static final Target BTN_LOGOUT = Target.the("User Name Login")
            .located(By.id("logout_sidebar_link"));

}
