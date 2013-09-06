package ru.zkir.mp2mp.taskgeocoder;


/**
 * Created with IntelliJ IDEA.
 * User: Zkir
 * Date: 15.01.13
 * Time: 21:03
 * To change this template use File | Settings | File Templates.
 */

public class GeocoderConfig{
  String[] levelsForCity;
  String[] levelsForRegion;
  String[] redundantWords;
  String language;
  boolean blnHamletsExcluded;
  boolean blnPerformTransliteration;
  GeocoderConfig(String strCountryCode)
  {
    //Cхема адресации зависит от страны.

    levelsForCity = new String[] {};
    levelsForRegion=new String[] {};
    redundantWords=new String[] {};
    language="";
    blnHamletsExcluded=false;
    blnPerformTransliteration=true;

    //Страно-специфичные правила
    //===========================================================================================
    //Европа
    //===========================================================================================
    //Андорра
    if (strCountryCode.equals("AD"))
    {
      levelsForCity=new String[] {"7"};
      levelsForRegion=new String[] {"2"};
    }

    //Албания
    if (strCountryCode.equals("AL"))
    {
      levelsForCity=new String[] {"8"};
      levelsForRegion=new String[] {"6"};
    }

    //Австрия
    if (strCountryCode.equals("AT"))
    {
      levelsForCity=new String[] {"8","6"};
      levelsForRegion=new String[] {"6"};
      redundantWords=new String [] {"Bezirk","Kreis"};
    }

    //Бельгия
    if (strCountryCode.equals("BE"))
    {
      levelsForCity=new String[] {"8"};
      levelsForRegion=new String[] {"6","4"};
    }

    //Чехия
    if (strCountryCode.equals("CZ"))
    {
      levelsForCity=new String[] {"8","7"};
      levelsForRegion=new String[] {"6"};
    }
    //Германия
    if (strCountryCode.equals("DE"))
    {
      levelsForCity=new String[] {"CITY_POLYGON","8"};
      levelsForRegion=new String[] {"6"};
      redundantWords=new String [] {"Bezirk","Kreis"};
    }

    //Эстония
    if (strCountryCode.equals("EE"))
      levelsForCity=new String[] {"9"};

    //Испания
    if (strCountryCode.equals("ES"))
    {
      levelsForCity=new String[] {"8"};
      levelsForRegion=new String[] {"6"};
    }

    //Греция
    if (strCountryCode.equals("GR"))
    {
      levelsForCity=new String[] {"7","8","10"};
      levelsForRegion=new String[] {"4"};
      redundantWords=new String [] {"Demos","Periphereia","Kentorikes"};
    }

    //Ирландия
    if (strCountryCode.equals("IE"))
    {
      levelsForCity=new String[] {"CITY_POLYGON","8","10","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"6"};
      redundantWords=new String [] {"County"};
    }

    //Исландия
    if (strCountryCode.equals("IS"))
    {
      levelsForCity=new String[] {"6","8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
    }

    //Хорватия
    if (strCountryCode.equals("HR"))
    {
      levelsForCity=new String[] {"8","7","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"6"};
    }
    //Лихтенштейн
    if (strCountryCode.equals("LI"))
    {
      levelsForCity=new String[] {"8"};
      levelsForRegion=new String[] {"6","2"};
    }

    //Монако
    if (strCountryCode.equals("MC"))
    {
      levelsForCity=new String[] {"8"};
      levelsForRegion=new String[] {"2"};
    }

    //Голландия
    if (strCountryCode.equals("NL"))
    {
        levelsForCity=new String[] {"10","8"};
        levelsForRegion=new String[] {"4"};
    }

    //Португалия
    if (strCountryCode.equals("PT"))
    {
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"6"};
    }

    //Швеция
    if (strCountryCode.equals("SE"))
    {
      levelsForCity=new String[] {"7"};
      levelsForRegion=new String[] {"4"};
      redundantWords =new String[]{"Kommune","lan"};
    }

    //Сан-Марино
    if (strCountryCode.equals("SM"))
    {
      levelsForCity=new String[] {"8"};
      levelsForRegion=new String[] {"2"};
    }



    //Турция
    if (strCountryCode.equals("TR"))
    {
      levelsForCity=new String[] {"6"};
      levelsForRegion=new String[] {"4"};
    }

    //Кипр
    if (strCountryCode.equals("CY"))
    {
      levelsForCity=new String[] {"CITY_POLYGON","8","7","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"6","2"};
    }

    //Польша
    if (strCountryCode.equals("PL"))
    {
      levelsForCity=new String[] {"8","10", "7", "6"};
      levelsForRegion=new String[] {"6"};
      redundantWords=new String []{"gmina","powiat"};
    }

    if (strCountryCode.equals("SK"))
    {
      levelsForCity=new String[] {"6","9"};
      levelsForRegion=new String[] {"4"};
    }

    //Словения
    if (strCountryCode.equals("SI"))
    {
      levelsForCity=new String[] {"8"};
      levelsForRegion=new String[] {"5"};
    }

    //Венгрия
    if (strCountryCode.equals("HU"))
    {
      levelsForCity=new String[] {"8", "7"};
      levelsForRegion=new String[] {"6"};
      redundantWords=new String []{"megye"};
    }

    //Румыния
    if (strCountryCode.equals("RO"))
    {
      levelsForCity=new String[] {"CITY_POLYGON","6","4","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"5","4"};
      redundantWords=new String []{"Municipiul"};
    }

    if (strCountryCode.equals("LT"))
      levelsForCity=new String[] {"8"};

    //Италия
    if (strCountryCode.equals("IT"))
    {
      levelsForCity=new String[] {"8"};
      levelsForRegion=new String[] {"6"};
    }

    //Великобритания. Как-то не понятно.
    if (strCountryCode.equals("GB"))
    {
      levelsForCity=new String[] {"8","10","6"};
      levelsForRegion=new String[] {"5","4"};
    }

    //Болгария
    if (strCountryCode.equals("BG"))
    {
      levelsForCity=new String[] {"10","8","6"}; //Проблема - София единственная имеет admin_level=6
      levelsForRegion=new String[] {"6"};
      redundantWords=new String [] {"Област","Община","Град"};
      blnPerformTransliteration=false;
    }

    //Сербия
    if (strCountryCode.equals("RS"))
    {
      levelsForCity=new String[] {"8","7"};
      levelsForRegion=new String[] {"6"};
      redundantWords=new String [] {"Komuna","Opshtina"};
    }

    //Македония
    if (strCountryCode.equals("MK"))
    {
      levelsForCity=new String[] {"CITY_POLYGON","8","7"};
      levelsForRegion=new String[] {"4"};
      redundantWords=new String []{"Opshtina"};
    }

    //Босния и герцеговина
    if (strCountryCode.equals("BA"))
    {
      levelsForCity=new String[] {"8","7","6"};
      levelsForRegion=new String[] {"5"};
      redundantWords=new String [] {"Opstina","Obchina"};

    }
    //Норвегия
    if (strCountryCode.equals("NO"))
    {
      levelsForCity=new String[] {"7"};
      levelsForRegion=new String[] {"4","6"};
    }

    //Дания
    if (strCountryCode.equals("DK"))
    {
      levelsForCity=new String[] {"8","7"};
      levelsForRegion=new String[] {"4"};
      redundantWords =new String[]{"Kommune","Region"};
    }

    //Швейцария
    if (strCountryCode.equals("CH"))
    {
      levelsForCity=new String[] {"8"};
      levelsForRegion=new String[] {"4"};
    }

    //Франция
    if (strCountryCode.equals("FR"))
    {
      levelsForCity=new String[] {"8"};
      levelsForRegion=new String[] {"6"};
    }

    //Мальта
    if (strCountryCode.equals("MT"))
    {
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
    }

    //Туркмения
    if (strCountryCode.equals("TM"))
    {
      levelsForCity=new String[] {"CITY_POLYGON","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
    }

    //Израиль
    if (strCountryCode.equals("IL"))
    {
      levelsForCity=new String[] {"8"};
      levelsForRegion=new String[] {"4"};
      language="en";
    }

    //===========================================================================================
    //Америка
    //===========================================================================================
    //США
    if (strCountryCode.equals("US"))
      levelsForCity=new String[] {"8","6"};

    //Чили
    if (strCountryCode.equals("CL"))
    {
      levelsForCity=new String[] {"8"};
      levelsForRegion=new String[] {"6"};
    }
    //Venezuela
    if (strCountryCode.equals("VE"))
    {
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
      blnHamletsExcluded=true;
    }
    //Парагвай
    if (strCountryCode.equals("PY"))
    {
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
    }

    //Фолклендские о-ва
    if (strCountryCode.equals("FK"))
    {
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
    }

    //Куба
    if (strCountryCode.equals("CU"))
    {
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      //levelsForCity=new String[] {"8"};
      levelsForRegion=new String[] {"4"};
    }

    //Панама
    if (strCountryCode.equals("PA"))
    {
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
    }
    //Белиз
    if (strCountryCode.equals("BZ"))
    {
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
    }

    //Коста-Рика CR
    if (strCountryCode.equals("CR"))
    {
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
    }

    //Гватемала - GT
    if (strCountryCode.equals("GT"))
    {
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
    }
    //Гондурас -- HN
    if (strCountryCode.equals("HN"))
    {
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
    }
    //Никарагуа NI
    if (strCountryCode.equals("NI"))
    {
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
    }

    //Сальвадор - SV
    if (strCountryCode.equals("SV"))
    {
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
    }

    //Ямайка - JM
    if (strCountryCode.equals("JM"))
    {
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"6"};
    }

    //Мексика - MX
    if (strCountryCode.equals("MX"))
    {
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
    }

    //Бразилия BR
    if (strCountryCode.equals("BR"))
    {
      levelsForCity=new String[] {"8"};
      levelsForRegion=new String[] {"4"};
    }

    //===========================================================================================
    //Азия
    //===========================================================================================
    //Египет
    if (strCountryCode.equals("EG"))
    {
      language="en";
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      blnHamletsExcluded=true;
      levelsForRegion=new String[] {"4"};
      redundantWords= new String[]{"Governorate"};

    }
    //Тунис
    if (strCountryCode.equals("TN"))
    {
      language="en";
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      blnHamletsExcluded=true;
      levelsForRegion=new String[] {"4"};
    }

    //Арабские эмираты
    if (strCountryCode.equals("AE"))
    {
      language="en";
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
    }

    //Шри-Ланка
    if (strCountryCode.equals("LK"))
    {
      levelsForCity=new String[] {"8","NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
    }

    //Таиланд
    if (strCountryCode.equals("TH"))
    {
      language="en";
      levelsForCity=new String[] {"NEAREST_CITY_POINT"};
      levelsForRegion=new String[] {"4"};
    }

    //Сингапур
    if (strCountryCode.equals("SG"))
    {
      //Временный хак, чтобы глаза не мозолило
      levelsForCity=new String[] {"2"};
      levelsForRegion=new String[] {"2"};
    }

    //Гонконг
    if (strCountryCode.equals("HK"))
    {
      //Для начала
      language="en";
      levelsForCity=new String[] {"8"};
      levelsForRegion=new String[] {"6"};
    }
  }

}
