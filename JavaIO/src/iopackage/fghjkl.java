package iopackage;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Stream;

enum fghjkl {
	NITHIN;
	
	public static void main(String[] args)  {		
		/*try {
			throw new IOException();
		} catch (RuntimeException e) {

		} catch (IOException e) {
			e.printStackTrace();
		}	
		Queue q = new PriorityQueue<>();
		q.stream();
		
		Map m = new HashMap<>();
		m.stream();*/
		 List<Integer> list = new ArrayList<>(Arrays.asList(4,3,52));
		 for(Integer item: list) {
		 System.out.print(item+" ");
		 list.add(9);
		 } 
	}
}
