package com.gildedrose;

class GildedRose {
    Item[] items;
    
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItem(item);
        }
    }

    private void updateItem(Item item) {
        if (item.name.equals(AGED_BRIE)) {
            updateQualityForItem(item, 1);
        } else if (item.name.equals(BACKSTAGE_PASSES)) {
            updateBackstagePassQuality(item);
        } else if (!item.name.equals(SULFURAS)) {
            updateQualityForItem(item, -1);
        }
        updateSellIn(item);
        handleExpiredItem(item);
    }

    private void updateQualityForItem(Item item, int change) {
        if (item.quality + change <= 50 && item.quality + change >= 0) {
            item.quality += change;
        }
    }

    private void updateBackstagePassQuality(Item item) {
        updateQualityForItem(item, 1);

        if (item.sellIn < 11) {
            updateQualityForItem(item, 1);
        }

        if (item.sellIn < 6) {
            updateQualityForItem(item, 1); 
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
                updateQualityForItem(item, 1); 
            } else if (item.name.equals(BACKSTAGE_PASSES)) {
                item.quality = 0;
            } else if (item.quality > 0 && !item.name.equals(SULFURAS)) {
                updateQualityForItem(item, -1); 
            }
        }
    }
}
