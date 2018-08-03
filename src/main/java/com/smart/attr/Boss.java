package com.smart.attr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Boss {

  private String name;
  private int age;
  private Car car = new Car();

  private List favoritesList = new ArrayList();
  private Set favoritesSet = new HashSet();
  private Map<String, Integer> jobTimeMap = new HashMap<String, Integer>();
  private Map jobsMap = new HashMap();
  private Properties mailsProperties = new Properties();

  public Boss() {
  }

  public Boss(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Car getCar() {
    return car;
  }

  public Map<String, Integer> getJobTimeMap() {
    return jobTimeMap;
  }

  public void setJobTimeMap(Map<String, Integer> jobTimeMap) {
    this.jobTimeMap = jobTimeMap;
  }

  public Map getJobsMap() {
    return jobsMap;
  }

  public void setJobsMap(Map jobsMap) {
    this.jobsMap = jobsMap;
  }

  public Properties getMailsProperties() {
    return mailsProperties;
  }

  public void setMailsProperties(Properties mailsProperties) {
    this.mailsProperties = mailsProperties;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  public List getFavoritesList() {
    return favoritesList;
  }

  public void setFavoritesList(List favoritesList) {
    this.favoritesList = favoritesList;
  }

  public Set getFavoritesSet() {
    return favoritesSet;
  }

  @Override
  public String toString() {
    return "Boss{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", car=" + car +
        ", favoritesList=" + favoritesList +
        ", favoritesSet=" + favoritesSet +
        ", jobTimeMap=" + jobTimeMap +
        ", jobsMap=" + jobsMap +
        ", mailsProperties=" + mailsProperties +
        '}';
  }

  public void setFavoritesSet(Set favoritesSet) {
    this.favoritesSet = favoritesSet;
  }
}
