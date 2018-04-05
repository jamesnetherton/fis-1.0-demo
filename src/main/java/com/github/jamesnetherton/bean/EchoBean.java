package com.github.jamesnetherton.bean;

import javax.sql.DataSource;

public class EchoBean {

    private DataSource dataSource;

    public void echo() {
        System.out.println("=======================> [DATASOURCE] " + dataSource);
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
