package ss8_clean_code.mvc.controller;


import ss8_clean_code.mvc.service.ISerStudent;
import ss8_clean_code.mvc.service.SerStudent;

public class ControllerStudent {
    private ISerStudent iSerStudent=new SerStudent();
        public void showListStudent() {
        iSerStudent.showListStudent();
        }
    }

