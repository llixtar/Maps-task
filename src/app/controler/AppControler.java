package app.controler;

import app.model.AppProductModel;
import app.model.DataProvider;
import app.view.AppView;


import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class AppControler {
    AppView view = new AppView();

    public void runApp() {

        DataProvider dataProvider = new DataProvider();
        Map<Integer, AppProductModel> iphones = dataProvider.getData();

        int reg = view.preview();

        if (reg == 1)
            showAllProducts(iphones);
        else if (reg == 2) {
            view.showText(showById(view.chooseId(), iphones));
        }
    }

    public void showAllProducts(Map<Integer, AppProductModel> map) {
        AtomicInteger count = new AtomicInteger(0);

        map.forEach((key, value) -> view.showText(String.format("%d) id %d   ", count.incrementAndGet(), key)
                + value.toString())
        );
    }

    private static String showById(Integer id, Map<Integer, AppProductModel> map) {
        String name = "";

        // Пошук за ключем
        boolean hasContain = map.containsKey(id);
        if (hasContain)
            name = String.valueOf(map.get(id));

        return name;
    }
}
