package com.gildedrose;
import java.util.List;

class GildedRose {
    private List<Item> items;
    
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public GildedRose(List<Item> items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItem(item);
        }
    }

    private void updateItem(Item item) {
        if (item.name.equals(AGED_BRIE)) {
            updateAgedBrieQuality(item);
            return;
        }

        if (item.name.equals(BACKSTAGE_PASSES)) {
            updateBackstagePassesQuality(item);
            return;
        }

        if (item.name.equals(SULFURAS)) {
            updateSulfurasQuality(item);
            return;
        }

        updateDefaultQuality(item);
        updateSellIn(item);
        handleExpiredItem(item);
    }

    private void updateAgedBrieQuality(Item item) {
        if (item.quality < 50) {
            item.quality += 1;
        }
    }

    private void updateBackstagePassesQuality(Item item) {
        if (item.quality < 50) {
            item.quality += 1;
            if (item.sellIn < 11) {
                if (item.quality < 50) item.quality += 1;
            }
            if (item.sellIn < 6) {
                if (item.quality < 50) item.quality += 1;
            }
        }
    }

    private void updateSulfurasQuality(Item item) {
        // Sulfuras quality does not change, no need for any logic here
    }

    private void updateDefaultQuality(Item item) {
        if (item.quality > 0 && !item.name.equals(SULFURAS)) {
            item.quality -= 1;
        }
    }

    private void updateSellIn(Item item) {
        if (!item.name.equals(SULFURAS)) {
            item.sellIn -= 1;
        }
    }

    private void handleExpiredItem(Item item) {
        if (item.sellIn < 0) {
            if (item.name.equals(AGED_BRIE)) {
                if (item.quality < 50) {
                    item.quality += 1;
                }
            } else if (item.name.equals(BACKSTAGE_PASSES)) {
                item.quality = 0;
            } else {
                if (item.quality > 0 && !item.name.equals(SULFURAS)) {
                    item.quality -= 1;
                }
            }
        }
    }
}
