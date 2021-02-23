package com.dumi.todoList;

import com.dumi.todoList.datamodel.TodoData;
import com.dumi.todoList.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {
    @FXML
    private TextField dialogShortDescription;
    @FXML
    private TextArea details;
    @FXML
    private DatePicker dialogDate;

    public TodoItem processResult(){
        String shortDescription = dialogShortDescription.getText().trim();
        String detail =details.getText().trim();
        LocalDate dateValue= dialogDate.getValue();
        TodoItem newItem =new TodoItem(shortDescription,detail,dateValue);
        TodoData.getInstance().addTodoItem(newItem);
        return newItem;


    }

}
