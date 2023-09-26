import { test, expect } from '@playwright/test';

const URL="https://razvanvancea.ro";

test('test1 - page title', async ({ page }) => {
  await page.goto(URL);
  await expect(page).toHaveTitle(/Trainer/);
});

test('test2 - heading text @smoke', async ({ page }) => {
  await page.goto(URL);
  await expect(page.getByRole('heading', { name: 'Hi, I am Razvan' })).toBeVisible();
});

test('test3 - footer workshops link @smoke', async ({ page }) => {
  await page.goto(URL);
  await expect(page.getByRole('contentinfo').getByRole('link', { name: 'Workshops' })).toBeVisible();
});