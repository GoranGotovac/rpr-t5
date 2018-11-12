package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

public class Controller {
    private SimpleStringProperty ulaz;
    public Controller() {
        ulaz = new SimpleStringProperty("0");
    }

    public String getUlaz() {
        return ulaz.get();
    }

    public SimpleStringProperty ulazProperty() {
        return ulaz;
    }

    public void nula(ActionEvent actionEvent) {
    }

    public void zarez(ActionEvent actionEvent) {
    }

    public void jedan(ActionEvent actionEvent) {
    }

    public void dva(ActionEvent actionEvent) {
    }

    public void tri(ActionEvent actionEvent) {
    }

    public void cetiri(ActionEvent actionEvent) {
    }

    public void pet(ActionEvent actionEvent) {
    }

    public void sest(ActionEvent actionEvent) {
    }

    public void plus(ActionEvent actionEvent) {
    }

    public void sedam(ActionEvent actionEvent) {
    }

    public void devet(ActionEvent actionEvent) {
    }

    public void osam(ActionEvent actionEvent) {
    }

    public void postotak(ActionEvent actionEvent) {
    }

    public void podijeljeno(ActionEvent actionEvent) {
    }

    public void put(ActionEvent actionEvent) {
    }

    public void minus(ActionEvent actionEvent) {
    }

    public void jednako(ActionEvent actionEvent) {
    }
}
