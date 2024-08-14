package com.example.hobbie.service;

import com.example.hobbie.model.entities.AppClient;
import com.example.hobbie.model.entities.Entry;
import com.example.hobbie.view.EntryViewModel;

import java.util.List;

public interface EntryService {
    List<EntryViewModel> getAboEntries(Long id);

    List<Entry> saveAboEntries(List<Entry> aboEntries);

    void saveUpdatedEntry(AppClient appClient, Long entryId);

    void confirmUpdatedEntry(Long entryId);

}
