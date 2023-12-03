# ShopGUIPlusSellBoost-ISetsAddon
ShopGUIPlus plugin is required

This addon allows you to boost the amount of money earned when players sell to the shop.

Using the below settings, the player will receive a 3.5x sell boost. For instance, if the total price of the sold
items was $5, they will receive $17.5.

```yaml
Boosts:
  - Namespace: ShopGUIPlus
    Type: "Sell Boost"
    Percent: false
    Settings:
      Boost_Amount: 3.5
```
