package com.sist.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class MovieDAO {
   @Autowired
   private MovieMapper mapper;
   public List<MovieVO> movieListData()
   {
	   return mapper.movieListData();
   }
   
   public MovieVO movieDetailData(int no)
   {
	   return mapper.movieDetailData(no);
   }
}
