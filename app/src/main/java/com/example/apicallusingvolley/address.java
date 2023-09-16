package com.example.apicallusingvolley;

public class address {
   String Name;
   String Description;
   String BranchType;
   String DeliveryStatus;
   String Taluk;
   String Circle;
   String District;
   String Division;
   String Region;
   String State;
   String Country;
   public address(){

   }

   public address(String name, String description, String branchType, String deliveryStatus, String taluk, String circle, String district, String division, String region, String state, String country) {
      Name = name;
      Description = description;
      BranchType = branchType;
      DeliveryStatus = deliveryStatus;
      Taluk = taluk;
      Circle = circle;
      District = district;
      Division = division;
      Region = region;
      State = state;
      Country = country;
   }

   public String getName() {
      return Name;
   }

   public void setName(String name) {
      Name = name;
   }

   public String getDescription() {
      return Description;
   }

   public void setDescription(String description) {
      Description = description;
   }

   public String getBranchType() {
      return BranchType;
   }

   public void setBranchType(String branchType) {
      BranchType = branchType;
   }

   public String getDeliveryStatus() {
      return DeliveryStatus;
   }

   public void setDeliveryStatus(String deliveryStatus) {
      DeliveryStatus = deliveryStatus;
   }

   public String getTaluk() {
      return Taluk;
   }

   public void setTaluk(String taluk) {
      Taluk = taluk;
   }

   public String getCircle() {
      return Circle;
   }

   public void setCircle(String circle) {
      Circle = circle;
   }

   public String getDistrict() {
      return District;
   }

   public void setDistrict(String district) {
      District = district;
   }

   public String getDivision() {
      return Division;
   }

   public void setDivision(String division) {
      Division = division;
   }

   public String getRegion() {
      return Region;
   }

   public void setRegion(String region) {
      Region = region;
   }

   public String getState() {
      return State;
   }

   public void setState(String state) {
      State = state;
   }

   public String getCountry() {
      return Country;
   }

   public void setCountry(String country) {
      Country = country;
   }
}
