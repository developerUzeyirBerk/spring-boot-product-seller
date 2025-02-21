package com.berkaltinok.spring_boot_product_seller;

import com.berkaltinok.spring_boot_product_seller.idgenerator.model.DefaultOne;
import com.berkaltinok.spring_boot_product_seller.idgenerator.model.IdentityOne;
import com.berkaltinok.spring_boot_product_seller.idgenerator.model.SequenceOne;
import com.berkaltinok.spring_boot_product_seller.idgenerator.model.TableOne;
import com.berkaltinok.spring_boot_product_seller.idgenerator.repository.IDefaultOneRepository;
import com.berkaltinok.spring_boot_product_seller.idgenerator.repository.ISequenceOneRepository;
import com.berkaltinok.spring_boot_product_seller.idgenerator.repository.ITableOneRepository;
import com.berkaltinok.spring_boot_product_seller.idgenerator.repository.IdentityOneRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IdGeneratorTest {
    @Autowired
    private IDefaultOneRepository defaultOneRepository;
    @Autowired
    private IdentityOneRepository identityOneRepository;
    @Autowired
    private ISequenceOneRepository sequenceOneRepository;
    @Autowired
    private ITableOneRepository tableOneRepository;



    // auto id nex-value: update hibernate_sequence set next_val= ? where next_val=?
    @Test
    public void save_auto_test()
    {
        DefaultOne defaultOne = new DefaultOne();
        defaultOne.setName("Test");

        defaultOneRepository.save(defaultOne);
    }

    // id bigint not null auto_increment
    @Test
    public void save_identity_test()
    {
        IdentityOne identityOne = new IdentityOne();
        identityOne.setName("Test");

        identityOneRepository.save(identityOne);
    }
    // update sequence_one_id set next_val= ? where next_val=?
    @Test
    public void save_sequence_test()
    {
        SequenceOne sequenceOne = new SequenceOne();
        sequenceOne.setName("Test");

        sequenceOneRepository.save(sequenceOne);
    }
    // update table_one_id_generator set next_val=?  where next_val=? and sequence_name=?
    @Test
    public void save_table_test()
    {
        TableOne tableOne = new TableOne();
        tableOne.setName("Test");

        tableOneRepository.save(tableOne);
    }
}
