package com.ibm.spring.beans;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaCollection {
 List<String> addressList;
 Set<String> addressSet;

 Map<String,String> addressMap;
 Properties addressProp;
 
 public List<String> getAddressList(){
	 return addressList;
 }
 public void setAddressList(List<String> addressList) {
	 this.addressList=addressList;
 }
 public Set<String> getAddressSet() {
	return addressSet;
}
 public void setAddressSet(Set<String> addressSet) {
	this.addressSet = addressSet;
 }
 public Map<String, String> getAddressMap() {
	return addressMap;
 }
 public void setAddressMap(Map<String, String> addressMap) {
	this.addressMap = addressMap;
 }
 public Properties getAddressProp() {
	return addressProp;
 }
 public void setAddressProp(Properties addressProp) {
	this.addressProp = addressProp;
 }

}
