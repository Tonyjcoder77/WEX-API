package com.api.wex.model.rates;

import java.util.List;

public class DataRecord {
     List<CountryRate> data;

     MetaData meta;

     LinksData links;

     public List<CountryRate> getData() {
          return data;
     }

     public MetaData getMeta() {
          return meta;
     }

     public LinksData getLink() {
          return links;
     }

     public void setData(List<CountryRate> data) {
          this.data = data;
     }

     public void setMeta(MetaData meta) {
          this.meta = meta;
     }

     public void setLink(LinksData links) {
          this.links = links;
     }

}
