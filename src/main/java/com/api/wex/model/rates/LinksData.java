package com.api.wex.model.rates;

public class LinksData {

    public String self;
    public String first;
    public String prev;
    public String next;
    public String last;

    public String getSelf() {
        return self;
    }

    public String getFirst() {
        return first;
    }

    public String getPrev() {
        return prev;
    }

    public String getNext() {
        return next;
    }

    public String getLast() {
        return last;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public void setLast(String last) {
        this.last = last;
    }

    //      "self": "&page%5Bnumber%5D=1&page%5Bsize%5D=100",
//              "first": "&page%5Bnumber%5D=1&page%5Bsize%5D=100",
//              "prev": null,
//              "next": "&page%5Bnumber%5D=2&page%5Bsize%5D=100",
//              "last": "&page%5Bnumber%5D=2&page%5Bsize%5D=100"
}
