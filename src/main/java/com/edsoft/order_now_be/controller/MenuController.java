package com.edsoft.order_now_be.controller;

import com.edsoft.order_now_be.model.BeachCategory;
import com.edsoft.order_now_be.model.BeachMenuItems;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = {"http://localhost:4200",
                        "https://menux.up.railway.app"})
public class MenuController {

    @GetMapping("/plaj")
    public ResponseEntity<List<BeachMenuItems>> getBeachMenu(@RequestParam(defaultValue = "TR") String lang) {
        List<BeachMenuItems> menuItems = null;

        if (lang.equalsIgnoreCase("TR")) {
            menuItems = List.of(
                    // 🍺 Bira
                    new BeachMenuItems("Beck's", "50cl şişe bira", new BigDecimal("270"), BeachCategory.Beer),
                    new BeachMenuItems("Belfast", "50cl şişe bira", new BigDecimal("250"), BeachCategory.Beer),
                    new BeachMenuItems("Bud", "50cl şişe bira", new BigDecimal("270"), BeachCategory.Beer),
                    new BeachMenuItems("Corona", "33cl şişe bira", new BigDecimal("270"), BeachCategory.Beer),
                    new BeachMenuItems("Bomonti Filtresiz", "50cl şişe bira", new BigDecimal("250"), BeachCategory.Beer),
                    new BeachMenuItems("Efes Malt", "50cl şişe bira", new BigDecimal("250"), BeachCategory.Beer),
                    new BeachMenuItems("Efes Özel Seri", "50cl şişe bira", new BigDecimal("250"), BeachCategory.Beer),
                    new BeachMenuItems("Miller", "33cl şişe bira", new BigDecimal("270"), BeachCategory.Beer),

                    // 🍸 Cin
                    new BeachMenuItems("Gordon's Dry Gin", "100cl şişe", new BigDecimal("6000"), BeachCategory.Gin),
                    new BeachMenuItems("Gordon's Dry Gin", "35cl şişe", new BigDecimal("2000"), BeachCategory.Gin),
                     new BeachMenuItems("Gordon's Premium Pink", "70cl şişe", new BigDecimal("4000"), BeachCategory.Gin),

                    // 🍹 Kokteyller
                    new BeachMenuItems("American Margarita", "Tekila, triple sec, lime", new BigDecimal("750"), BeachCategory.Cocktail),
                    new BeachMenuItems("Aperol Spritz", "Aperol, prosecco, soda", new BigDecimal("750"), BeachCategory.Cocktail),
                    new BeachMenuItems("Cin Tonik", "Klasik gin & tonic", new BigDecimal("450"), BeachCategory.Cocktail),
                    new BeachMenuItems("Espresso Martini", "Kahve aromalı votkalı kokteyl", new BigDecimal("500"), BeachCategory.Cocktail),
                    new BeachMenuItems("Kuzu Kulağı Kokteyli", "Navali Special – ferahlatıcı yaz kokteyli", new BigDecimal("600"), BeachCategory.Cocktail),
                    new BeachMenuItems("Rom Sour", "Rom, lime, şeker şurubu", new BigDecimal("600"), BeachCategory.Cocktail),
                    new BeachMenuItems("Sex on the Beach", "Votka, şeftali likörü, portakal ve kızılcık suyu", new BigDecimal("650"), BeachCategory.Cocktail),

                    // 🥃 Rakı
                    new BeachMenuItems("Beylerbeyi Göbek", "100cl şişe", new BigDecimal("3300"), BeachCategory.Raki),
                    new BeachMenuItems("Beylerbeyi Göbek", "70cl şişe", new BigDecimal("2500"), BeachCategory.Raki),
                    new BeachMenuItems("Beylerbeyi Göbek", "35cl şişe", new BigDecimal("1900"), BeachCategory.Raki),
                    new BeachMenuItems("Rakı Double", "İki ölçü rakı", new BigDecimal("500"), BeachCategory.Raki),
                    new BeachMenuItems("Rakı Tek", "Bir ölçü rakı", new BigDecimal("300"), BeachCategory.Raki),

                    // 🍷 Şarap
                    new BeachMenuItems("Antre - Beyaz Şarap", "Sauvignon Blanc", new BigDecimal("1450"), BeachCategory.Wine),
                    new BeachMenuItems("Antre - Kırmızı Şarap", "Öküzgözü & Boğazkere", new BigDecimal("1300"), BeachCategory.Wine),
                    new BeachMenuItems("Antre - Rose", "Kalecik Karası & Sangiovese", new BigDecimal("1450"), BeachCategory.Wine),
                    new BeachMenuItems("Smyrna Blush", "Grenache - Shiraz", new BigDecimal("1000"), BeachCategory.Wine),

                    // 🥃 Viski
                    new BeachMenuItems("Johnnie Walker Black Label", "12 yıllık, 100cl", new BigDecimal("4000"), BeachCategory.Whiskey),
                    new BeachMenuItems("Talisker Skye", "Single malt, 70cl", new BigDecimal("4500"), BeachCategory.Whiskey),

                    // 🍸 Votka
                    new BeachMenuItems("Smirnoff", "100cl şişe", new BigDecimal("6000"), BeachCategory.Votka),
                    new BeachMenuItems("Smirnoff", "70cl şişe", new BigDecimal("4000"), BeachCategory.Votka),

                    // 🍽️ Ana Yemekler
                    new BeachMenuItems("Bonfile", "Izgara dana bonfile", new BigDecimal("1200"), BeachCategory.Meal),
                    new BeachMenuItems("Izgara Köfte", "Ev yapımı köfte", new BigDecimal("550"), BeachCategory.Meal),
                    new BeachMenuItems("Izgara Tavuk", "Izgara tavuk göğsü", new BigDecimal("550"), BeachCategory.Meal),
                    new BeachMenuItems("Karışık Izgara", "Et, köfte ve tavuk karışımı", new BigDecimal("2000"), BeachCategory.Meal),
                    new BeachMenuItems("Kuzu Pirzola", "Izgara kuzu pirzola", new BigDecimal("900"), BeachCategory.Meal),
                    new BeachMenuItems("Kuzu Şiş", "Izgara kuzu şiş", new BigDecimal("750"), BeachCategory.Meal),
                    new BeachMenuItems("Tavuk Schnitzel", "Pane kaplamalı tavuk", new BigDecimal("500"), BeachCategory.Meal),

                    // 🍟 Atıştırmalıklar
                    new BeachMenuItems("Çıtır Sepeti", "Karışık kızartma tabağı", new BigDecimal("500"), BeachCategory.Snack),
                    new BeachMenuItems("Çorba", "Günün çorbası", new BigDecimal("300"), BeachCategory.Snack),
                    new BeachMenuItems("Patates Kızarması", "Kızarmış patates", new BigDecimal("200"), BeachCategory.Snack),
                    new BeachMenuItems("Peynir Tabağı", "Şarapla servis edilir", new BigDecimal("500"), BeachCategory.Snack),
                    new BeachMenuItems("Sigara Böreği", "Kızarmış peynirli börek", new BigDecimal("200"), BeachCategory.Snack),
                    new BeachMenuItems("Sosis Tava", "Kızarmış sosis", new BigDecimal("300"), BeachCategory.Snack),

                    new BeachMenuItems("Cheeseburger", "Dana burger ve cheddar peyniri", new BigDecimal("750"), BeachCategory.Burger),
                    new BeachMenuItems("Hamburger", "Klasik dana burger", new BigDecimal("550"), BeachCategory.Burger),

                    // ☕ Kahveler
                    new BeachMenuItems("Americano", "Sıcak espresso ve su karışımı", new BigDecimal("130"), BeachCategory.Coffee),
                    new BeachMenuItems("Café Crema", "Yoğun kremalı kahve", new BigDecimal("150"), BeachCategory.Coffee),
                    new BeachMenuItems("Cappuccino", "Espresso, süt ve süt köpüğü", new BigDecimal("150"), BeachCategory.Coffee),
                    new BeachMenuItems("Espresso", "Yoğun shot kahve", new BigDecimal("150"), BeachCategory.Coffee),
                    new BeachMenuItems("Latte", "Sütlü espresso", new BigDecimal("150"), BeachCategory.Coffee),
                    new BeachMenuItems("Flat White", "Kremalı sütlü espresso", new BigDecimal("150"), BeachCategory.Coffee),
                    new BeachMenuItems("Filtre Kahve", "Klasik demleme kahve", new BigDecimal("130"), BeachCategory.Coffee),
                    new BeachMenuItems("Nescafe", "Hazır kahve", new BigDecimal("120"), BeachCategory.Coffee),
                    new BeachMenuItems("Ice Latte", "Soğuk sütlü espresso", new BigDecimal("180"), BeachCategory.Coffee),
                    new BeachMenuItems("Ice Americano", "Soğuk espresso ve su", new BigDecimal("150"), BeachCategory.Coffee),
                    new BeachMenuItems("Ice Coffee", "Nescafe ve buz karışımı", new BigDecimal("180"), BeachCategory.Coffee),

                    // 🍵 Sıcak İçecekler
                    new BeachMenuItems("Çay", "Demleme siyah çay", new BigDecimal("50"), BeachCategory.HotDrink),
                    new BeachMenuItems("Türk Kahvesi", "Klasik Türk kahvesi", new BigDecimal("100"), BeachCategory.HotDrink)
            );
        } else if (lang.equalsIgnoreCase("EN")) {
            menuItems = List.of(
                    // 🍺 Beer
                    new BeachMenuItems("Beck's", "50cl bottled beer", new BigDecimal("270"), BeachCategory.Beer),
                    new BeachMenuItems("Belfast", "50cl bottled beer", new BigDecimal("250"), BeachCategory.Beer),
                    new BeachMenuItems("Bud", "50cl bottled beer", new BigDecimal("270"), BeachCategory.Beer),
                    new BeachMenuItems("Corona", "33cl bottled beer", new BigDecimal("270"), BeachCategory.Beer),
                    new BeachMenuItems("Bomonti Unfiltered", "50cl bottled beer", new BigDecimal("250"), BeachCategory.Beer),
                    new BeachMenuItems("Efes Malt", "50cl bottled beer", new BigDecimal("250"), BeachCategory.Beer),
                    new BeachMenuItems("Efes Special Series", "50cl bottled beer", new BigDecimal("250"), BeachCategory.Beer),
                    new BeachMenuItems("Miller", "33cl bottled beer", new BigDecimal("270"), BeachCategory.Beer),

                    // 🍸 Gin
                    new BeachMenuItems("Gordon's Dry Gin", "100cl bottle", new BigDecimal("6000"), BeachCategory.Gin),
                    new BeachMenuItems("Gordon's Dry Gin", "35cl bottle", new BigDecimal("2000"), BeachCategory.Gin),
                    new BeachMenuItems("Gordon's Premium Pink", "70cl bottle", new BigDecimal("4000"), BeachCategory.Gin),

                    // 🍹 Cocktails
                    new BeachMenuItems("American Margarita", "Tequila, triple sec, lime", new BigDecimal("750"), BeachCategory.Cocktail),
                    new BeachMenuItems("Aperol Spritz", "Aperol, prosecco, soda", new BigDecimal("750"), BeachCategory.Cocktail),
                    new BeachMenuItems("Gin Tonic", "Classic gin & tonic", new BigDecimal("450"), BeachCategory.Cocktail),
                    new BeachMenuItems("Espresso Martini", "Vodka and coffee-based cocktail", new BigDecimal("500"), BeachCategory.Cocktail),
                    new BeachMenuItems("Navali Signature", "Refreshing summer cocktail", new BigDecimal("600"), BeachCategory.Cocktail),
                    new BeachMenuItems("Rum Sour", "Rum, lime, sugar syrup", new BigDecimal("600"), BeachCategory.Cocktail),
                    new BeachMenuItems("Sex on the Beach", "Vodka, peach liqueur, orange & cranberry juice", new BigDecimal("650"), BeachCategory.Cocktail),

                    // 🥃 Raki
                    new BeachMenuItems("Beylerbeyi Göbek", "100cl bottle", new BigDecimal("3300"), BeachCategory.Raki),
                    new BeachMenuItems("Beylerbeyi Göbek", "70cl bottle", new BigDecimal("2500"), BeachCategory.Raki),
                    new BeachMenuItems("Beylerbeyi Göbek", "35cl bottle", new BigDecimal("1900"), BeachCategory.Raki),
                    new BeachMenuItems("Raki Double", "Double portion", new BigDecimal("500"), BeachCategory.Raki),
                    new BeachMenuItems("Raki Single", "Single portion", new BigDecimal("300"), BeachCategory.Raki),

                    // 🍷 Wine
                    new BeachMenuItems("Antre - White Wine", "Sauvignon Blanc", new BigDecimal("1450"), BeachCategory.Wine),
                    new BeachMenuItems("Antre - Red Wine", "Öküzgözü & Boğazkere", new BigDecimal("1300"), BeachCategory.Wine),
                    new BeachMenuItems("Antre - Rosé", "Kalecik Karası & Sangiovese", new BigDecimal("1450"), BeachCategory.Wine),
                    new BeachMenuItems("Smyrna Blush", "Grenache - Shiraz", new BigDecimal("1000"), BeachCategory.Wine),

                    // 🥃 Whiskey
                    new BeachMenuItems("Johnnie Walker Black Label", "12 Years Old, 100cl", new BigDecimal("4000"), BeachCategory.Whiskey),
                    new BeachMenuItems("Talisker Skye", "Single malt, 70cl", new BigDecimal("4500"), BeachCategory.Whiskey),

                    // 🍸 Vodka
                    new BeachMenuItems("Smirnoff", "100cl bottle", new BigDecimal("6000"), BeachCategory.Votka),
                    new BeachMenuItems("Smirnoff", "70cl bottle", new BigDecimal("4000"), BeachCategory.Votka),

                    // 🍽️ Meals
                    new BeachMenuItems("Beef Tenderloin", "Grilled beef fillet", new BigDecimal("1200"), BeachCategory.Meal),
                    new BeachMenuItems("Grilled Meatballs", "Homemade Turkish köfte", new BigDecimal("550"), BeachCategory.Meal),
                    new BeachMenuItems("Grilled Chicken", "Grilled chicken breast", new BigDecimal("550"), BeachCategory.Meal),
                    new BeachMenuItems("Mixed Grill", "Beef, chicken, and köfte mix", new BigDecimal("2000"), BeachCategory.Meal),
                    new BeachMenuItems("Lamb Chops", "Grilled lamb chops", new BigDecimal("900"), BeachCategory.Meal),
                    new BeachMenuItems("Lamb Skewer", "Grilled lamb skewers", new BigDecimal("750"), BeachCategory.Meal),
                    new BeachMenuItems("Chicken Schnitzel", "Breaded fried chicken", new BigDecimal("500"), BeachCategory.Meal),

                    // 🍟 Snack
                    new BeachMenuItems("Crispy Basket", "Mixed fried Snack", new BigDecimal("500"), BeachCategory.Snack),
                    new BeachMenuItems("Soup", "Soup of the day", new BigDecimal("300"), BeachCategory.Snack),
                    new BeachMenuItems("French Fries", "Crispy fried potatoes", new BigDecimal("200"), BeachCategory.Snack),
                    new BeachMenuItems("Cheese Platter", "Served with wine", new BigDecimal("500"), BeachCategory.Snack),
                    new BeachMenuItems("Sigara Böreği", "Fried pastry with cheese", new BigDecimal("200"), BeachCategory.Snack),
                    new BeachMenuItems("Fried Sausages", "Pan-fried sausages", new BigDecimal("300"), BeachCategory.Snack),

                    new BeachMenuItems("Cheeseburger", "Beef burger with cheddar cheese", new BigDecimal("750"), BeachCategory.Burger),
                    new BeachMenuItems("Hamburger", "Classic beef burger", new BigDecimal("550"), BeachCategory.Burger),

                    // ☕ Coffee
                    new BeachMenuItems("Americano", "Espresso with hot water", new BigDecimal("130"), BeachCategory.Coffee),
                    new BeachMenuItems("Café Crema", "Creamy espresso", new BigDecimal("150"), BeachCategory.Coffee),
                    new BeachMenuItems("Cappuccino", "Espresso with milk and foam", new BigDecimal("150"), BeachCategory.Coffee),
                    new BeachMenuItems("Espresso", "Strong shot of coffee", new BigDecimal("150"), BeachCategory.Coffee),
                    new BeachMenuItems("Latte", "Espresso with steamed milk", new BigDecimal("150"), BeachCategory.Coffee),
                    new BeachMenuItems("Flat White", "Espresso with velvety milk", new BigDecimal("150"), BeachCategory.Coffee),
                    new BeachMenuItems("Filter Coffee", "Classic brewed coffee", new BigDecimal("130"), BeachCategory.Coffee),
                    new BeachMenuItems("Instant Coffee", "Hot instant coffee", new BigDecimal("120"), BeachCategory.Coffee),
                    new BeachMenuItems("Iced Latte", "Cold espresso with milk", new BigDecimal("180"), BeachCategory.Coffee),
                    new BeachMenuItems("Iced Americano", "Cold espresso with water", new BigDecimal("150"), BeachCategory.Coffee),
                    new BeachMenuItems("Iced Coffee", "Nescafe with ice", new BigDecimal("180"), BeachCategory.Coffee),

                    // 🍵 Hot Drinks
                    new BeachMenuItems("Tea", "Freshly brewed black tea", new BigDecimal("50"), BeachCategory.HotDrink),
                    new BeachMenuItems("Turkish Coffee", "Traditional Turkish coffee", new BigDecimal("100"), BeachCategory.HotDrink)
            );
        }

        return ResponseEntity.ok(menuItems);
    }

    }
