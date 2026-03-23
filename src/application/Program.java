package application;

import java.util.List;

import mode.dao.DaoFactory;
import mode.dao.SellerDao;
import model.entitites.Department;
import model.entitites.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findById =====");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findyByDepartment(department);
		for(Seller obj:list) {
			System.out.println(obj);
		}
		
	}

}
