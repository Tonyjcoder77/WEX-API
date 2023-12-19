package com.api.wex.model.rates;

public class MetaData {

       public Integer count;
       public Labels labels;
       public DataTypes dataTypes;
       public DataFormats dataFormats;
       public Integer totalcount;
       public Integer totalpages;

       public Integer getCount() {
              return count;
       }

       public void setCount(Integer count) {
              this.count = count;
       }

       public Labels getLabels() {
              return labels;
       }

       public void setLabels(Labels labels) {
              this.labels = labels;
       }

       public DataTypes getDataTypes() {
              return dataTypes;
       }

       public void setDataTypes(DataTypes dataTypes) {
              this.dataTypes = dataTypes;
       }

       public DataFormats getDataFormats() {
              return dataFormats;
       }

       public void setDataFormats(DataFormats dataFormats) {
              this.dataFormats = dataFormats;
       }

       public Integer getTotalcount() {
              return totalcount;
       }

       public void setTotalcount(Integer totalcount) {
              this.totalcount = totalcount;
       }

       public Integer getTotalpages() {
              return totalpages;
       }

       public void setTotalpages(Integer totalpages) {
              this.totalpages = totalpages;
       }
//        "count": 100,
//                "labels": {
//        "country_currency_desc": "Country - Currency Description",
//                "exchange_rate": "Exchange Rate",
//                "record_date": "Record Date"
//    },
//            "dataTypes": {
//        "country_currency_desc": "STRING",
//                "exchange_rate": "NUMBER",
//                "record_date": "DATE"
//    },
//            "dataFormats": {
//        "country_currency_desc": "String",
//                "exchange_rate": "10.2",
//                "record_date": "YYYY-MM-DD"
//    },
//            "total-count": 172,
//            "total-pages": 2
}
