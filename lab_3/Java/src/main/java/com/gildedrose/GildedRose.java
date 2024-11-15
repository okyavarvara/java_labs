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
            updateItem(item)
                    }
                }
      private void updateItem(Item item) {
        if (!item.name.equals(AGED_BRIE) && !item.name.equals(BACKSTAGE_PASSES)) {
            if (item.quality > 0 && !item.name.equals(SULFURAS)) {
                item.quality -= 1;
            }
        } else {
            if (item.quality < 50) {
                item.quality += 1;

                if (item.name.equals(BACKSTAGE_PASSES)) {
                    if (item.sellIn < 11 && item.quality < 50) {
                        item.quality += 1;
                    }

                    if (item.sellIn < 6 && item.quality < 50) {
                        item.quality += 1;
                    }
                }
            }
        }

        if (!item.name.equals(SULFURAS)) {
            item.sellIn -= 1;
        }

        if (item.sellIn < 0) {
            if (!item.name.equals(AGED_BRIE)) {
                if (!item.name.equals(BACKSTAGE_PASSES)) {
                    if (item.quality > 0 && !item.name.equals(SULFURAS)) {
                        item.quality -= 1;
                    }
                } else {
                    item.quality = 0;
                }
            } else {
                if (item.quality < 50) {
                    item.quality += 1;
                }
            }
        }
    }
}
