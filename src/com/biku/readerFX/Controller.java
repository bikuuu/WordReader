package com.biku.readerFX;

import com.biku.reader.FileOpener;
import com.biku.reader.Reader;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.UnsupportedEncodingException;

import java.io.File;

public class Controller  {

    @FXML
    private Button loadFile;
    @FXML
    private ListView listViewPath;
    @FXML
    private Button run;
    @FXML
    private ListView numberOfWords;

    private String filePath;

    public void LoadFileButtonClick() throws UnsupportedEncodingException {
        FileChooser fileChooser = new FileChooser();

        //Set extension filters
        FileChooser.ExtensionFilter extensionFilterTxt =
                new FileChooser.ExtensionFilter("txt files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().addAll(extensionFilterTxt);

        //Show open file dialog
       File selectedFile = fileChooser.showOpenDialog(null);
       filePath = selectedFile.toString();

        if (selectedFile != null){
           listViewPath.getItems().add(selectedFile.getPath());
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("File is not valid");
            alert.show();
        }
    }

    public void RunButtonClick(){
        String fileOpener = new FileOpener().OpenFile(filePath);
        int read = new Reader().Read(fileOpener);
        String value = Integer.toString(read);
        //TODO: Transfer read value to numberOfWords ListView
    }
}