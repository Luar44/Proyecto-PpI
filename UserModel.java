package com.example.BBR.Models;

import jakarta.persistence.*;
@Entity
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable=false,unique=true)
    private Long id;
    private String name;
    private Integer cellphone;
    private String address;
    private String date;
    private Integer code;

    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}

    public Integer getCellphone() {
        return cellphone;}
    public void setCellphone(Integer cellphone) {
        this.cellphone = cellphone;}

    public String getAddress() {
        return address;}
    public void setAddress(String address) {
        this.address = address;}

    public String getDate(){
        return date;}
    public void setDate(String date) {
        this.date = date;}

    public Integer getCode() {
        return code;}
    public void setCode(Integer code) {
        this.code = code;}

    public Long getId() {
        return id;}
    public void setId(Long id) {
        this.id = id;}
}
