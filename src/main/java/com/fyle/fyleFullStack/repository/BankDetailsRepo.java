package com.fyle.fyleFullStack.repository;

import com.fyle.fyleFullStack.model.BankDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BankDetailsRepo extends JpaRepository<BankDetails,Integer> {
    @Query(value = "Select * from bank_branches as b where " +
            "b.branch LIKE CONCAT('%',:branch, '%') " +
            "order by b.ifsc "+
            " limit :pageLimit " +
            "offset :pageOffset ",
            nativeQuery = true
    )
    List<BankDetails> findByBranch(@Param("branch") String branch,@Param("pageLimit") Integer pageLimit,@Param("pageOffset") Integer pageOffset);

    @Query(value = " Select * from bank_branches as b where " +
            "b.ifsc LIKE CONCAT('%',:searchTerm, '%') or " +
            "b.bank_id LIKE CONCAT('%',:searchTerm, '%') or " +
            "b.branch LIKE CONCAT('%',:searchTerm, '%') or " +
            "b.address LIKE CONCAT('%',:searchTerm, '%') or " +
            "b.city LIKE CONCAT('%',:searchTerm, '%') or " +
            "b.district LIKE CONCAT('%',:searchTerm, '%') or " +
            "b.state_name LIKE CONCAT('%',:searchTerm, '%') " +
            "order by b.ifsc "+
            " limit :pageLimit " +
            "offset :pageOffset ",
            nativeQuery = true
    )
    List<BankDetails> findBySearchTerm(@Param("searchTerm") String searchTerm,@Param("pageLimit") Integer pageLimit,@Param("pageOffset") Integer pageOffset);
}
