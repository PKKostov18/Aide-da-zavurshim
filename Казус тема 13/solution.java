class Author {
private String name;
private String address; 
private String url;
  
public Author() {
}
  
public Author(String name, String address, String url) {
this.name = name;
this.address = address;
this.url=url;
}
  
public String getName() {
  return name;
}

public void setName(String name) {
  this.name = name;
}
  
public String getAddress() {
return address;
}
  
public void setAddress(String address) {
  this.address = address;
}
  
public String getUrl() {
return url;
}
  
public void setUrl(String url) {
  this.url = url;
}

}