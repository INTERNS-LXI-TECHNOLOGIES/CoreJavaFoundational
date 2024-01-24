package com.divisosoft.movie.movie;
import com.divisosoft.movie.lead.*;
import com.divisosoft.movie.side.*;
public class Movie  {
public String name;
public Hero hero;
public Heroine heroine;
public Villain villain;
public Comedian comedian;

public String toString()
{

return  "\n Movie name: \t"+name + "\n"+hero+heroine+villain+comedian;

}

}