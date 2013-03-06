package azure.control;

import azure.domain.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AzureController {

    @RequestMapping(value = "/")
    public String index() {

        System.out.println("Hello from Azure index");
        return "static_index";
    }



    @RequestMapping(value = "/kfc/{name}")
    public @ResponseBody Shop getShopInJSON(@PathVariable String name) {

           
        System.out.println("JSON Say Hi to The World");
        Shop shop = new Shop();
        shop.setName(name);
        shop.setStaffName(new String[]{"kavan", "mohammad", "javad"});

        return shop;

    }
}