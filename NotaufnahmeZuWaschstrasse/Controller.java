
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.input.*;

public class Controller {

    Warteliste warteliste;

    @FXML
    private ListView listView;

    @FXML
    private TextField txtName;

    @FXML
    private Label lblMeldung;

    public Controller()
    {
        warteliste = new Warteliste();
    }

    // Aufruf eines weiteren Patienten
    // Meldung im entspeichenden Feld
    @FXML
    public void aufruf(ActionEvent event) {
        
        Auto auto = warteliste.entfernen();
        if (auto != null)
        {  
            listView.getItems().remove(auto.getKennzeichen());
            lblMeldung.setText("Nächstes Auto: " + auto.getKennzeichen());
        }
        else { 
            lblMeldung.setText("Kein Auto");
        }

    }     

    // Einfügen per Button einfügen
    @FXML
    public void einfuegen(Event event) {
        autoEinfuegen();
    }

    // Einfügen per Return
    @FXML
    public void handleTxtEinfuegen(KeyEvent event) {
        if(event.getCode() == KeyCode.ENTER)
        {
            autoEinfuegen();
        }

    }

    public void autoEinfuegen()
    {
        String kennzeichen = txtName.getText();
        if (kennzeichen.equals("")){
            lblMeldung.setText("Kein Kennzeichen?");
        }
        else {          
                Auto auto = new Auto(kennzeichen);
                warteliste.einfuegen(auto);
                listView.getItems().add(kennzeichen);
                txtName.setText("");
            }
        }
    

}